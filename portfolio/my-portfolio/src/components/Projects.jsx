import data from "../data/portfolioData";

function Projects() {
  return (
    <section id="projects">
      <h2>Projects</h2>

      {data?.projects?.map((project, index) => (
        <div key={index} className="card">
          <h3>{project.title}</h3>

          <p>{project.description}</p>
        </div>
      ))}
    </section>
  );
}

export default Projects;
