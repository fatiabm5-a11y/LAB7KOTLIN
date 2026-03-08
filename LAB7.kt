data class Student(val fullName: String, var id: Int, var grade: Double)

val students = listOf(
    Student("Yassine", 101, 150.0),
    Student("Salma", 202, 120.0),
    Student("Karim", 303, 130.0),
    Student("Lina", 404, 140.0)
)

fun getStudentById(id: Int): Student? {
    return students.find { it.id == id }
}


fun searchInStudents(name: String): Student? {
    return students.find { it.fullName.lowercase() == name.lowercase() }
}

fun main() {

   
    val id1 = 303
    println("Search ID: $id1")
    println(getStudentById(id1) ?: "Student not found")

    
    val id2 = 999
    println("Search ID: $id2")
    println(getStudentById(id2) ?: "Student not found")

   
}