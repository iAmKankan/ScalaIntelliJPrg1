package Class

/**
  * Created by hadoop on 20/2/17.
  */
trait Notification
case class Email(sourceEmail: String, title: String, body: String) extends Notification
case class SMS(sourceNumber: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

object CaseClass {
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        "You got an email from " + email + " with title: " + title
      case SMS(number, message) =>
        "You got an SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
    }
  }

  def main(args: Array[String]): Unit = {
    val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!") //No need "new" keyword
    println(emailFromJohn);
    println(emailFromJohn.sourceEmail);
    //--------------object compare-------------------
    val firstSms = SMS("12345", "Hello!")
    val secondSms = SMS("12345", "Hello!")
    if (firstSms == secondSms) {
      println("They are equal!")
      //---------- match case------------
      showNotification(SMS("888888","HI"))
    }


  }

}
