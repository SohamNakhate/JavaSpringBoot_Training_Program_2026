import { useTypewriter } from "../hooks/useTypewriter";

function Hero(){

const text=useTypewriter([
"Java Developer",
"Machine Learning Enthusiast",
"Backend Developer",
"Research Intern"
]);

return(
<section id="home" className="hero">

<div>
<h1>Hi, I'm Soham Nakhate</h1>

<h2>{text}</h2>

<p>
Computer Science student focused on scalable systems,
machine learning, and clean software design.
</p>

<div>
<a href="/resume.pdf" download>
Resume
</a>

<a href="#contact">
Contact
</a>
</div>

</div>

</section>
)

}

export default Hero;