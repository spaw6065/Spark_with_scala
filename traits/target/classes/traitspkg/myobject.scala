package traitspkg

object myobject {
  def main(args:Array[String])={
   println("Inside main method")
   
   //As myprintln is not overridden in myclass so this will invoke the method from mytrait
   val myobj1 = new myclass
   myobj1.myprintln
   //myobj1.myprintln3("hello") //this is from myclass
   myobj1.myprintln3
  }
}