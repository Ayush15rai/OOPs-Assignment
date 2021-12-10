package OOPs_2

class Person(var name: String, var age: Int) extends Ordered[Person]{

  override def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => if (this.age.equals(that.age))
        println("True\nName and age both are same")
      else
        println("False\nName are same but ages are not equal")
        0



      case 2 => if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
                            println("True")
                            else println("False")
                            1
    }
  }

}

object Person extends App {
  var firstPerson = new Person("Lucifer", 24)
  var secondPerson = new Person("Amenadiel", 28)
  firstPerson compare secondPerson
}
