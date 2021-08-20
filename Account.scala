object Account extends App {
        val ac1 = new Account("K L PADMAWATI",12000,120010);
        val ac2 = new Account("P P GUNARATNA",-2500,120011);
        val ac3 = new Account("S A Y S AKILA",0,120012);

        println("\nMoney successfully transferred!")
        println("-------------------------------------------------------------------")
        ac1.transfer(2000,ac2)
        println("Updated account details : \n" + ac1 + "\n" + ac2) 
        println("-------------------------------------------------------------------")     
} 
class Account ( x:String , y: Double , z : Int){

    val name : String = x
    var bal : Double = y
    val acnum : Int = z  

    def withdraw( amount : Double ) = this.bal -= amount

    def deposit ( amount : Double ) = this.bal += amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.bal =  this.bal - amount
        that.bal = that.bal + amount
    }

    @Override
    override def toString() : String = "---------------------\n Name : " + this.name + "\n Account Number : " + this.acnum + "\n Balance : Rs." + this.bal
}