# Klubbens medlemsregister

## Arbetsfördelning

- **Tommy – `Main.java`, `README.md`**  
  Meny och användarinmatning. Skapade även projektet, GitHub-repot och README-grunden. Skrev punkterna 3–5.

- **Johanna-Louise (J-Lo) – `Medlem.java`, `README.md`**  
  Medlemsobjekt med konstruktor och getters. Skrev punkt 1.

- **Jonny – `Register.java`, `README.md`**  
  Medlemslista och metoder för medlemshantering. Skrev punkt 2.

## Vår Git-konfliktövning

För att öva på konfliktlösning ändrade två gruppmedlemmar avsiktligt samma rad i `README.md`, på varsin branch.

När den första pull requesten hade mergats till `main` uppstod en konflikt i den andra. Tommy ansvarade för själva
konfliktlösningen i GitHubs editor medan han delade sin skärm med gruppen via Discord. Han såg till att bådas texter
behölls, tog bort dubblerade rubriker och ersatte de motstridiga statusraderna med en gemensam text.

På så sätt kunde hela gruppen följa konfliktlösningen och lära sig hur man hanterar en Git-konflikt utan att förlora
någon av gruppmedlemmarnas arbete.

## 1. Datalogiskt tänkande (J-Lo)

Vi började med att gå igenom projektet tillsammans och fundera på vilka delar som behövde finnas med.
Projektet innehöll tre klasser, så vi bestämde oss för att fördela arbetet så att varje gruppmedlem ansvarade för varsin
klass.
Därefter delade vi upp uppgiften i mindre steg, som att skapa klasser, lägga till metoder och få de olika funktionerna
att fungera tillsammans.
Det gjorde det enklare att planera arbetet och fördela uppgifterna inom gruppen. På så sätt kunde vi arbeta steg för
steg och få en bättre överblick över projektets utveckling.

## 2. Klass och objekt (Jonny)

Vi delade upp programmet i tre klasser med olika ansvarsområden. Tommy arbetade med Main.java,
Johanna med Medlem.java och jag med Register.java. Min klass ansvarar för att hantera medlemmarna
i registret. Jag använde en ArrayList för att lagra medlemsobjekten och skapade metoder för att
lägga till, visa och söka efter medlemmar. Varje medlem är ett eget objekt som skapas utifrån
klassen Medlem.

Jag använde även private för att skydda listan med medlemmar, så att andra klasser inte kan
ändra den direkt. I stället hanteras listan genom klassens metoder. Det kallas inkapsling.

Genom att dela upp programmet i olika klasser fick vi en tydligare struktur och kunde arbeta
med våra egna delar.

## 3. Samarbete i Git (Tommy)

Vi har samarbetat på GitHub med hjälp av en privat gruppchatt i Discord. Vi har både fört muntliga samtal och chattat.

Vi beslutade oss gemensamt för att jobba på enskilda grenar, så att vi kan jobba enskilt men samtidigt få öva på ett
realistiskt Git-flöde. Under utvecklingen av Java-programmet undvek vi konflikter genom att tilldela varje person en
egen klass och låta någon annan i gruppen granska och merga våra pull requests, i stället för att göra det själva.

## 4. Ett problem vi löste (Tommy)

När vi startade projektet insåg vi att Git inte versionshanterar tomma mappar, vilket innebar att övriga gruppmedlemmar
inte skulle få med sig `src`-mappen när de klonade projektet.

Vi löste det genom att först skapa och ladda upp en nästan tom `Main.java` i mappen. Därefter kunde de andra
gruppmedlemmarna klona projektet och skapa sina respektive klasser.

## 5. AI och externa hjälpmedel (Tommy)

Vi har använt AI för att strukturera upp gruppens arbete. Vi har inte bett om färdiga lösningar, utan använt AI som
vägledning när vi har behövt hjälp.

ChatGPT föreslog exempelvis metodnamnet `listaAlla()`, men vi använde i stället `visaAllaMedlemmar()` eftersom det var
namnet på metoden som implementerades i `Register.java`.

Vi har också använt AI för att planera en övning där vi avsiktligt skapade en Git-konflikt, så att vi fick träna på att
lösa ett sådant problem.

## Konfliktövning (Jonny + J-Lo)

Status: Konflikten löst!