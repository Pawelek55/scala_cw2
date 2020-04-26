
object cw2 {
  def main(args: Array[String]) = {
    
   /// Exercise 1 
    def whichDay(d: String): String = d.toLowerCase() match {      
        case "poniedziałek" | "wtorek" | "środa" | "czwartek" | "piątek" => "Praca"
        case "sobota" | "niedziela" => "Weekend"
        case _ => "Nie ma takiego dnia"
    }
    
    println(whichDay("Środa"))
  
   /// Exercise 2 
  
    class Account(accBalance: Int) {
            private var _privAccBalance: Int = accBalance;
            
            def this() = this(0);
        
          //salary
           def withdrawal_(m: Int): Unit =  {  
             _privAccBalance = _privAccBalance - m;
           }
           //payment
           def payment_(m: Int): Unit =  {  
             _privAccBalance = _privAccBalance + m
           }
           //account balance
           def accountBalance() = _privAccBalance;
     }
      
      val account1 = new Account();
       println(account1.payment_(478))
       println(account1.accountBalance)
       println(account1.withdrawal_(250))
       println(account1.accountBalance)
       println(account1.payment_(575))
       println(account1.accountBalance)
       println(account1.withdrawal_(3000))
       println(account1.accountBalance)
       
     
    /// Exercise 3 
       
   case class Person(firstName: String, lastName: String) {}
       
   val Rysiek = new Person("Rysiek", "Stolarczyk");
   val Staszek = new Person("Staszek", "Kolakiewicz");
   val Jan = new Person("Jan","Kowalski");
   
   def welcome(person: Person): String = {
    person.firstName match {
      case "Rysiek" => s"Witam, cześć i czołem, pytacie skąd się wziąłem - ${person.firstName}."
      case "Staszek" => s"Witam Pana serdecznie, Panie ${person.firstName}."
      case _ => "Cześć nieznajomy."
    }
  }
   
   println(welcome(Rysiek));
   println(welcome(Staszek));
   println(welcome(Jan))
   
   /// Exercise 4
   
   def showNameFewTimes( numTimes: Int, callback:(Int) => Unit) {
      for (i <- 1 to numTimes*3) {
        callback(i)
      }
    }
    
    val sayYourName = (lapNumber: Int) => println("Rysiek i okrążenie " + lapNumber)
    
    showNameFewTimes(4, sayYourName)
    
    /// Exercise 5
    class Person_class() {
      private val _name: String = ""
      private val _lastname: String = ""
      private var _tax: Double = 1
      
      def name = _name
      def lastname = _lastname
      def tax = _tax
    }
    
    trait Student extends Person_class {
      override def tax: Double = 0
    }
    
   
    trait Employee extends Person_class {
      private var _salary: Double = 0
      
      def salary = _salary
      def salary_= (value: Double) = _salary = (value * tax)
      
      override def tax: Double = 0.80
    }
    
     trait Teacher extends Employee {
      override def tax: Double = 0.90
    }

    var student = new Student{}
    
    var employee = new Employee{}
    employee.salary = 5000
    
    var teacher = new Teacher{}
    teacher.salary = 5000
    
    println("Student tax: " + student.tax + ", teacher tax: " + teacher.tax +", employee tax: " + employee.tax )
    println("Teacher salary: " + teacher.salary)
    println("Employee salary: " + employee.salary)
    
  }
}



