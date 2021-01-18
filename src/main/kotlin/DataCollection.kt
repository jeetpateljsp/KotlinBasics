//fun main() {
//    val mFirstName = "Jeet"
//    val mLastName = "Patel"
//    val mAge = 23
//}

fun main() {
    val mFullName = Pair<String, String>("Jeet", "Patel")
    val mAge = 23

    println("My name is ${mFullName.first} ${mFullName.second}")

    val (mFirstName, mLastName) = mFullName;

    println("My name is $mFirstName $mLastName")

    val mPersonBirthDate = Triple(29, "January", 1998)
    val mPerson = Pair("Jeet Patel", mPersonBirthDate)

    val (mName, mBDay) = mPerson
    val (mDay, mMonth, mYear) = mBDay

    println("My name is $mName")
    println("My birthdate is $mMonth $mDay, $mYear.")

}