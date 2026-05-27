import data from "../data/portfolioData";

function Skills(){

return(

<section id="skills">

<h2>Skills</h2>

<div className="skills">

{
data.skills.map((skill,index)=>(

<span key={index}>
{skill}
</span>

))
}

</div>

</section>

)

}

export default Skills;