import Greetings from "./Greetings"

function Details() {

    const name = "Soham Nakhate"
    const age = 21
    const isStudent = true
    const hasFees = false
    const city = "Nagpur"
    const marks = 90

  return (
    <>
        <h1>Details Component</h1>
        <h2>Name: {name}</h2>
        <p>Age: {age}</p>

        {/* Greetings component */}
        <Greetings name={name} city={city} />

        <p>Is it a Student: {isStudent ? "Yes" : "No"}</p>
        <p>Are the fees pending? {hasFees ? <button>Pay Fees</button> : <p>No</p>}
        </p>
        <h2>RESULT : {(marks >= 40) ? "Pass" : "Fail"}</h2>
    </>
  )
}

export default Details
