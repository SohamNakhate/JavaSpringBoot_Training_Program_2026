import { useScrollSpy } from "../hooks/useScrollSpy";

function Navbar() {
  const activeSection = useScrollSpy([
    "home",
    "about",
    "experience",
    "projects",
    "skills",
    "contact"
  ]);

  const links = [
    "home",
    "about",
    "experience",
    "projects",
    "skills",
    "contact"
  ];

  return (
    <nav className="navbar">
      <h2>Soham</h2>

      <ul>
        {links.map((link)=>(
          <li key={link}>
            <a
              href={`#${link}`}
              className={activeSection===link ? "active":""}
            >
              {link}
            </a>
          </li>
        ))}
      </ul>
    </nav>
  );
}

export default Navbar;