package controllers

import models.Tab
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready.", Tab.findAll))
  }

}