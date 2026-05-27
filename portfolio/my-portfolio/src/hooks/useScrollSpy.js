import { useEffect, useState } from "react";

export function useScrollSpy(ids) {
  const [active, setActive] = useState("");

  useEffect(() => {
    function onScroll() {
      ids.forEach((id) => {
        const section = document.getElementById(id);

        if (section) {
          const top = section.offsetTop - 150;
          const height = section.offsetHeight;

          if (window.scrollY >= top && window.scrollY < top + height) {
            setActive(id);
          }
        }
      });
    }

    window.addEventListener("scroll", onScroll);

    return () => window.removeEventListener("scroll", onScroll);
  }, []);

  return active;
}
