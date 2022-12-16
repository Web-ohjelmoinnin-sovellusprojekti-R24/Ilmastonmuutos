# Visualisointityökalu ilmastonmuutoksen historiasta


Yleiskuvaus projektista

   Projektin tarkoituksena on käyttää palvelimessa React- ja Java-teknologiaa ja hyödyntää sitä ilmastonmuutoksen liittyvän tiedon visualisointityökalun tekemiseen.
   Selain toimii tällä hetkellä vain paikallisesti, ja käyttäjälle annetaan mahdollisuus luoda käyttäjätunnus ja myös kirjautua sinne. Kirjautumisen myötä käyttäjä pystyy luomaan omat visualisointinäkymänsä valmiina esillä olevista kymmenestä kuvaajasta. Projektissa käyttäjä pystyy tallentamaan luomansa visualisointinäkymän vaihtoehdot tietokantaan, mutta sen näyttämiselle ei ole erillistä funktiota My views-sivulla.  Visualisointinäkymien avulla kuvaajia voisi vertailla käyttäjän haluamalla tavalla. Käyttäjälle annetaan myös mahdollisuus poistaa oma tilinsä. 
   
   Projektin ulkoasun esittely

   Selaimen etusivulla on kaksi näkymän luomiseen tarkoitettua vaihtoehtoa, joista käyttäjä voi valita, vaikka ei olisikaan kirjautunut vielä sisään. Sivulla on esillä myös koko ajan navigation bar, jolla voi liikkua eri paikkoihin. Sen vaihtoehtoina ovat Create new view, kaksi default-näkymää sekä Login ja Log out painike. Mahdollisena valintana on myös Settings-sivu. Uuden näkymän luonnissa on mahdollista valita rinnakkain ja allekkain näkymän välillä, ja niihin käyttäjä pystyy sijoittamaan valitsemansa kuvaajat. Kuvaajille pystyy myös kirjoittamaan kuvatekstit. Sivun yläosassa olevasta valikosta pystyy valitsemaan My views-osion, jossa pystyisi tarkastelemaan käyttäjäkohtaisesti luotuja visualisointinäkymiä. Alla kuva kirjautumissivun käyttöliittymäsuunnitelmasta, joka luotiin ennen itse sovelluksen tekemisen aloittamista 

![adsadsadas](https://user-images.githubusercontent.com/61183450/208095284-e3b9efd1-a25f-402c-97dc-22308792c507.png)

ja alla kuva projektin lopullisesta kirjautumissivusta.
![kirjautumissivu](https://user-images.githubusercontent.com/61183450/208095436-892b03f4-3f1f-4251-ab0c-75a4b7c7970c.png)

Projektissa käytetty teknologia

   Projektin luomiseen on käytetty backendissä Javaa/Spring Boottia ja frontendin päässä Reactia. Ohjelman tietokanta on rakennettu hyödyntäen Javaa ja tehty Database clientillä. Ohjelman ulkoasu on tehty Reactilla, joka lähettää post- ja get-kutsuja backendiin, jossa Spring boot vastaanottaa ne ja vastaa. Sivun ulkoasun tekemiseen on myös hyödynnetty Bootstrap-kirjastoa, jonka avulla esimerkiksi navigation bar tehtiin, ja kuvaajien tekemiseen Chart.js-kirjastoa, joka tarjoaa erilaisia työkaluja kuvaajien tekemiseen. Sovelluksen tietokantarakenne koostuu alla olevan kuvan mukaisista tauluista.

![db](https://user-images.githubusercontent.com/61183450/208095562-2a43faea-aa74-4a14-b046-7b56f4a7140e.png)

Projektin tekijät

   Projektin tekijät ovat Oulun ammattikorkeakoulun opiskelijat [Jussi Mehtälä](https://github.com/SKIPAH), [Onni Nurkkala](https://github.com/OnniNurkkala), [Miia Uusitalo](https://github.com/Miiapetri) ja [Topias Mäyrä](https://github.com/VeikkQ). Projektin tekijät toimivat kaikki full stack -kehittäjinä, eikä tarkempia rooleja oikein jaettu. Kaikki ovat olleet osallisina front- ja backendin kehityksessä. Tehtävien jakoon on käytetty GitHubissa Kanban-mallinnusta, jonka avulla on pystytty navigoimaan mitä kukakin tekee. 


Projektin GitHub-linkki

https://github.com/Web-ohjelmoinnin-sovellusprojekti-R24/Ilmastonmuutos


