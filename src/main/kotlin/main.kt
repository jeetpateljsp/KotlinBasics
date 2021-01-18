fun main(arguments: Array<String>) {

    var mMyAge: Int = 23
    val mFirstName: String = "Jeet"
    val mLastName = "Patel"
    val mWeight = 63.5

    mFirstTutorial(mMyAge, mFirstName, mLastName, mWeight)
    mSecondTutorial(mMyAge)

}

fun mSecondTutorial(mMyAge: Int) {
    val areYouAwesome = true

    println("Am i awesome? $areYouAwesome")

    val isLegalDrivingAge = mMyAge >= 18
    println(isLegalDrivingAge)
}

fun mFirstTutorial(mMyAge: Int, mFirstName: String, mLastName: String, mWeight: Double) {

    /**
     * calls [main]
     * variables [arguments].
     *
     * @param arguments
     * */

    /*
    * */

    //

    println(mFirstName.length)

    val mMessage = "$mFirstName $mLastName is $mMyAge years old, and weighs $mWeight kg."
    println(mMessage)
}