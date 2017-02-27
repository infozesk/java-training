

// Creates canvas 320 × 200 at 10, 50
var paper = Raphael('draw', 300, 500);

// Creates circle at x = 50, y = 40, with radius 10
circle_1 = paper.circle(100, 100, 50);
circle_1.attr("fill", "#FF0000")

// Draw UML using nomnoml

// diagrammeClasse présente un diagramme de classe 'classique'
var canvas = document.getElementById('diagrammeClasse');
var source = `
[MachineDeVente] <- [MachineACafe]
[MachineDeVente] <- [MachineABonbon]
[MachineDeVente
 |
   +credit: int
 |
   +ajouterCredit(in credit: int);
   +acheter(in itemId: int)
]
[MachineACafe
 |
   +prixCafe: int
 |
   +acheterCafe()
]
[MachineABonbon
 |
   +prixBonbon: int
 |
   +acheterBonbon()
]
`;
nomnoml.draw(canvas, source);

// diagrammeClasse présente un diagramme de classe 'classique'
var canvas2 = document.getElementById('diagrammeActivite');
var source2 = `
[<start>st] crédit -> [<state>credité]
[credité] sucre -> [<state>sucre choisi]
[sucre choisi] café -> [<state>café choisi]
[café choisi] verse -> [<state>café versé]
[café versé] -> [<choice>monnaie?]
[monnaie?] oui -> [<state>monnaie]
[monnaie?] non -> [<end>e]
[<state>monnaie] rendre monnaie -> [<state>monnaie rendue]
[<state>monnaie rendue] ->[<end>e]
`;
nomnoml.draw(canvas2, source2);

canvas2 = document.getElementById('diagrammeActivite2');
source2 = `
// En mode verbe
[<start>st] -> [ouvrir machine]
[ouvrir machine] -> [recharger café]
[recharger café] -> [fermer machine]
[fermer machine] ->[<end> e]

`;
nomnoml.draw(canvas2, source2);

canvas2 = document.getElementById('diagrammeCasUtilisation');
source2 = `
[<actor>client]->[<usecase>commander café]
[<actor>agent]->[<usecase>recharger café]
[<actor>agent]->[<usecase>récupérer argent]
`;
nomnoml.draw(canvas2, source2);



console.log('haha');



