LaTeX (LuaLaTeX) Buch-Projekt mit 'subfiles'
==============================================

Struktur
--------
latex-book-subfiles/
├── main.tex            -> Hauptdatei (Kompilation für das gesamte Buch)
├── chapters/
│   ├── einfuehrung.tex -> Kapiteldatei (standalone kompilierbar)
│   └── zweierkomplement.tex
├── appendix/
│   └── anhang.tex      -> Anhang (standalone kompilierbar)
└── figures/            -> Bilderordner

Kompilieren
-----------
Gesamtbuch:
  lualatex main.tex
  (Empfohlen: latexmk -lualatex main.tex)

Einzelnes Kapitel (z.B. Einführung):
  lualatex chapters/einfuehrung.tex

Hinweise
--------
- 'subfiles' ermöglicht, dass die Kapitel eigenständig kompiliert werden, nutzen aber die Präambel der main.tex.
- Für Bildpfade im Subfile: nutzt '\graphicspath{{\subfix{../figures/}}}' im Kapitel, damit Grafikpfade beim Einzel- und Gesamtlauf funktionieren.
- Mit '\includeonly{...}' in main.tex kannst du gezielt Kapitel für schnellere Läufe aktivieren (bei Nutzung von \include statt \subfile).
