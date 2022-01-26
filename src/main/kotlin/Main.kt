fun main(args: Array<String>) {

    println("Please select your favorite color: \n1. Red \n2. Blue \n3. Yellow \n4. Green \n5. Orange \n6. Violet")

    var choice = 5

    while (choice != 0) {
        println("Please select your favorite color: \n1. Red \n2. Blue \n3. Yellow \n4. Green \n5. Orange \n6. Violet \n0. Exit")
        choice = readLine()!!.toInt()
        if (choice == 1)
            println("Your favorite color is Red\n")
        else if (choice == 2)
            println("Your favorite color is Blue\n")
        else if (choice == 3)
            println("Your favorite color is Yellow\n")
        else if (choice == 4)
            println("Your favorite color is Green\n")
        else if (choice == 5)
            println("Your favorite color is Orange\n")
        else if (choice == 6)
            println("Your favorite color is Violet\n")
        else if (choice == 0)
            println("Exit")
        else
            println("Please make a valid selection")
    }




}