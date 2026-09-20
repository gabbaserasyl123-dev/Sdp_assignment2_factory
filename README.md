Dinosaur Factories

Part A (Factory Method): the abstract creator Nest declares the factory method createDinosaur(), and the concrete nests AllosaurusNest and BrachiosaurusNest decide which Dinosaur is created.

Part B (Abstract Factory): the interface EraFactory creates a consistent set of a Theropod, a Herbivore and an Armored dinosaur, and JurassicFactory and CretaceousFactory each produce the set of one era. The Client works only through these interfaces.

Packages:
dinosaurs: shared products used by both parts
factorymethod: Part A
abstractfactory: Part B



Clean Code Requirements

●	Meaningful, intention-revealing names for classes/methods/variables
<img width="485" height="230" alt="image" src="https://github.com/user-attachments/assets/1e73c446-4660-4318-ad20-f7ff4e123516" />

●	Small methods, each doing one thing
<img width="507" height="176" alt="image" src="https://github.com/user-attachments/assets/bf8ff959-e7db-4252-bed6-afc7c97b9d73" />
<img width="427" height="103" alt="image" src="https://github.com/user-attachments/assets/79984aab-8868-4a02-8f5b-3eada2efc015" />

●	Consistent formatting and small, focused classes
<img width="1005" height="460" alt="image" src="https://github.com/user-attachments/assets/14daa045-13f0-4de5-8e19-8a8874464c9d" />

●	No magic numbers/strings
<img width="455" height="102" alt="image" src="https://github.com/user-attachments/assets/37d423c1-bd91-45f5-960b-ce86e7efb6ed" />
