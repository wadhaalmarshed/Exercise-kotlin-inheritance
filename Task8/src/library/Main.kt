package library

fun main() {
    val myFirstBook = FictionBook("The Hobbit", "J.R.R. Tolkien", 12743,"Fantasy")
    val mySecondBook = NonFictionBook("Atomic Habits", "James Clear", 46588,"Personal Development", 320 )

    val myFictionBook = myFirstBook.displayInfo()
    println(myFictionBook)

    println("---------------")
    
    val myNonFictionBook = mySecondBook.displayInfo()
    println(myNonFictionBook)



}