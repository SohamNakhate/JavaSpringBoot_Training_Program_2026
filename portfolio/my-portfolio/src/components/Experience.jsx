import data from "../data/portfolioData";

function Experience() {

    
  return (
    <section id="experience">
      <h2>Experience</h2>

      {data.experience.map((exp, index) => (
        <div key={index} className="card">
          <h3>{exp.role}</h3>

          <h4>{exp.company}</h4>

          <p>{exp.duration}</p>

          <ul>
            {exp.points.map((point, i) => (
              <li key={i}>{point}</li>
            ))}
          </ul>
        </div>
      ))}
    </section>
  );
}

export default Experience;
