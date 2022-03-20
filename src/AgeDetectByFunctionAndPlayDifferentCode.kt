

fun isQualified(){
    // this function will run when age in 18..60 as per called on fun main
    println("Congratulation You are Qualified for Submission")
    print("Enter your NID no: ")
    val nid = readln()!!.toInt()
    print("Enter your name: ")
    val name = readln()!!.toString()
    print("Enter your country: ")
    val country = readln()!!.toString()

    println("======== Your Submission Info ========")
    println("Your name is: $name")
    println("Your NID no is: $nid")
    println("Your country is: $country")
}

// get the age parameter from fun main when age in 15 to 17. to calculate to show after how many years we'll remember you
fun needImprove(age:Int){
    // this function will run when age in 15..17 as per called on fun main
    println("Hey dear, You're almost there, you've to 18 years old")
    print("Enter your mobile number: ")
    val mobNumber = readln()!!.toInt()
    print("Enter your name: ")
    val name = readln()!!.toString()

    println("======== Your Submission Info ========")
    println("Your name is: $name")
    println("Your number is: $mobNumber")
    println("Dear $name, We'll remember you after ${18-age} year")
}

//when age will out of our conditions
fun invalid(){
    println("You're not in our qualified range.")
    //you can write here your own more code
}

fun main(){

    //get age first than calculate and check with condition and run anything
    print("Enter your age: ")
    val age = readln()!!.toInt()

    /* if condition */
//    if (age in 18..60){
//        isQualified()
//    }else if (age in 15..17){
//        needImprove()
//    }else{
//        invalid()
//    }

    /* when condition */
    when (age){
        in 18..60-> isQualified() //when input age in 18 to 60, will run the function named isQualified
        in 15..17->needImprove(age) //when input age in 15 to 17, will run the function named needImprove. Also return age parameter to use on called function
        else-> invalid() // without our above condition any age will run invalid function
    }

}


