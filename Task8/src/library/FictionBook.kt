package library

class FictionBook(title:String , author:String , ISBN:Int , var genre: String): Book(title, author,ISBN)
{
    override fun displayInfo() = "This is your choice of fiction book: \n ${super.displayInfo()} Book Genre: $genre"

}