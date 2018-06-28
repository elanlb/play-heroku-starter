package controllers

import javax.inject._
import play.api.Logger
import play.api.mvc._

import java.util.Calendar
import java.text.SimpleDateFormat

// This controller creates an 'Action' to handle HTTP requests to the application's home page.

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // A basic controller to serve the home page
  def index() = Action { implicit request: Request[AnyContent] =>
    Logger.debug("Someone accessed the index page!")
    
    val format = new SimpleDateFormat("d/M/y")
    val currentDate = format.format(Calendar.getInstance().getTime())

    Ok(views.html.index(currentDate))
  }
}
