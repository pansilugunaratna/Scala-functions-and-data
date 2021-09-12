object Bank extends App {

    val bank : List[Account] = List( 
                    new Account("J K S DANIEL", 5000, 120001), 
                    new Account("H M SRIYANI", -4500, 120002), 
                    new Account("H I GAMINI", -3500, 120003),
                    new Account("K L PADMAWATI", 12000,120010),
                    new Account("P P GUNARATNA", -2000,120011),
                    new Account("S A Y S AKILA", 0, 120012) 
                )

    //Find account by account number
    val find = ( n : Int , b : List[Account]) => b.filter( x => x.acnum.equals( n ))
    //Get the list of accounts with negative balances
    val overdraft = ( b : List[Account] ) => b.filter( x => x.bal < 0)
    //Total amount left in the bank
    val balance = ( b: List[Account] ) => b.map( x => (x,x.bal) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )
    //Update interest
    val interest = ( b : List[Account] ) => b.map( x => {
        x.bal match {
            case a if a >= 0 => x deposit x.bal * 0.05
            case _ => x withdraw Math.abs(x.bal) * 0.1
        }
        x
    })
    println("-------------------------------------------------------------------")
    print("Accounts :\n ")
    for(element <- bank){
        println(element)
    }
    println("-------------------------------------------------------------------")
    print("Account with the AccNumber 120011 :\n " )
    for(element <- find( 120011 , bank)){
        println(element)
    }
    println("-------------------------------------------------------------------")
    print("List of accounts with negative balances :\n ")
    for(element <- overdraft( bank )){
        println(element)
    }
    println("-------------------------------------------------------------------")
    println("Total amount left in the bank : Rs." + balance( bank )._2 )
    println("Total amount left in the bank Account: Rs." + balance( bank )._1 )
    println("-------------------------------------------------------------------")

    println("Accounts after interest updates: \n ")
    for(element <- interest( bank ) ){
        println(element)
    }
    println("-------------------------------------------------------------------")
    println("Total amount left in the bank : Rs." + balance( bank )._2 )
    println("-------------------------------------------------------------------")
}