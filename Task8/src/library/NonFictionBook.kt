package library

class NonFictionBook (title:String , author:String , ISBN:Int , var genre: String, var numberOfPages: Int ): Book(title, author,ISBN)
    {
        override fun displayInfo() = "This is your choice of non-fiction book: \n ${super.displayInfo()} Book Genre: $genre - It contains $numberOfPages pages"

    }
