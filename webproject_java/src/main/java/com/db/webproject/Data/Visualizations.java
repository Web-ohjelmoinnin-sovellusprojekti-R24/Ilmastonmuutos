package com.db.webproject.Data;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visualizations {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private  String date;
    @Column(name = "time_type")
    private  String time_type;
    @Column(name = "globald")
    private  BigDecimal globald;
    @Column(name = "northernd")
    private  BigDecimal northernd;
    @Column(name = "southernd")
    private  BigDecimal southernd;
    @Column(name = "globalc")
    private  BigDecimal globalc;
    @Column(name = "annualavg")
    private  BigDecimal annualavg;
    @Column(name = "monthlyavg")
    private  BigDecimal monthlyavg;
    @Column(name = "sub_sector")
    private  String sub_sector;
    @Column(name = "sector")
    private  String sector;
    @Column(name = "sub_percent")
    private  BigDecimal sub_percent;
    @Column(name = "sector_percent")
    private  BigDecimal sector_percent;
    @Column (name="afghanistan")
    private BigDecimal afghanistan;
    @Column (name="albania")
    private BigDecimal albania;
    @Column (name="algeria")
    private BigDecimal algeria;
    @Column (name="andorra")
    private BigDecimal andorra;
    @Column (name="angola")
    private BigDecimal angola;
    @Column (name="antigua_and_barbuda")
    private BigDecimal antigua_and_barbuda;
    @Column (name="argentina")
    private BigDecimal argentina;
    @Column (name="armenia")
    private BigDecimal armenia;
    @Column (name="aruba")
    private BigDecimal aruba;
    @Column (name="australia")
    private BigDecimal australia;
    @Column (name="austria")
    private BigDecimal austria;
    @Column (name="azerbaijan")
    private BigDecimal azerbaijan;
    @Column (name="bahamas")
    private BigDecimal bahamas;
    @Column (name="bahrain")
    private BigDecimal bahrain;
    @Column (name="bangladesh")
    private BigDecimal bangladesh;
    @Column (name="barbados")
    private BigDecimal barbados;
    @Column (name="belarus")
    private BigDecimal belarus;
    @Column (name="belgium")
    private BigDecimal belgium;
    @Column (name="belize")
    private BigDecimal belize;
    @Column (name="benin")
    private BigDecimal benin;
    @Column (name="bermuda")
    private BigDecimal bermuda;
    @Column (name="bhutan")
    private BigDecimal bhutan;
    @Column (name="bonaire__saint_eustatius_and_saba")
    private BigDecimal bonaire__saint_eustatius_and_saba;
    @Column (name="bosnia_and_herzegovina")
    private BigDecimal bosnia_and_herzegovina;
    @Column (name="botswana")
    private BigDecimal botswana;
    @Column (name="brazil")
    private BigDecimal brazil;
    @Column (name="british_virgin_islands")
    private BigDecimal british_virgin_islands;
    @Column (name="brunei_darussalam")
    private BigDecimal brunei_darussalam;
    @Column (name="bulgaria")
    private BigDecimal bulgaria;
    @Column (name="burkina_faso")
    private BigDecimal burkina_faso;
    @Column (name="burundi")
    private BigDecimal burundi;
    @Column (name="cambodia")
    private BigDecimal cambodia;
    @Column (name="canada")
    private BigDecimal canada;
    @Column (name="cape_verde")
    private BigDecimal cape_verde;
    @Column (name="central_african_republic")
    private BigDecimal central_african_republic;
    @Column (name="chad")
    private BigDecimal chad;
    @Column (name="chile")
    private BigDecimal chile;
    @Column (name="china")
    private BigDecimal china;
    @Column (name="colombia")
    private BigDecimal colombia;
    @Column (name="comoros")
    private BigDecimal comoros;
    @Column (name="congo")
    private BigDecimal congo;
    @Column (name="cook_islands") 
    private BigDecimal cook_islands;
    @Column (name="costa_rica")
     private BigDecimal costa_rica;
    @Column (name="côte_divoire")
    private BigDecimal côte_divoire;
    @Column (name="croatia")
    private BigDecimal croatia;
    @Column (name="cuba")
    private BigDecimal cuba;
    @Column (name="curaçao")
    private BigDecimal curaçao;
    @Column (name="cyprus")
    private BigDecimal cyprus;
    @Column (name="czech_republic")
    private BigDecimal czech_republic;
    @Column (name="north_korea")
    private BigDecimal north_korea;
    @Column (name="democratic_republic_of_the_congo")
    private BigDecimal democratic_republic_of_the_congo;
    @Column (name="denmark")
    private BigDecimal denmark;
    @Column (name="djibouti")
    private BigDecimal djibouti;
    @Column (name="dominica")
    private BigDecimal dominica;
    @Column (name="dominican_republic")
    private BigDecimal dominican_republic;
    @Column (name="ecuador")
    private BigDecimal ecuador;
    @Column (name="egypt")
    private BigDecimal egypt;
    @Column (name="el_salvador")
    private BigDecimal el_salvador;
    @Column (name="equatorial_guinea")
    private BigDecimal equatorial_guinea;
    @Column (name="eritrea")
    private BigDecimal eritrea;
    @Column (name="estonia")
    private BigDecimal estonia;
    @Column (name="ethiopia")
    private BigDecimal ethiopia;
    @Column (name="faeroe_islands")
    private BigDecimal faeroe_islands;
    @Column (name="micronesia")
    private BigDecimal micronesia;
    @Column (name="fiji")
    private BigDecimal fiji;
    @Column (name="finland")
    private BigDecimal finland;
    @Column (name="france")
    private BigDecimal france;
    @Column (name="french_guiana")
    private BigDecimal french_guiana;
    @Column (name="french_polynesia")
    private BigDecimal french_polynesia;
    @Column (name="gabon")
    private BigDecimal gabon;
    @Column (name="gambia")
    private BigDecimal gambia;
    @Column (name="georgia")
    private BigDecimal georgia;
    @Column (name="germany")
    private BigDecimal germany;
    @Column (name="ghana")
    private BigDecimal ghana;
    @Column (name="greece")
    private BigDecimal greece;
    @Column (name="greenland")
    private BigDecimal greenland;
    @Column (name="grenada")
    private BigDecimal grenada;
    @Column (name="guadeloupe")
    private BigDecimal guadeloupe;
    @Column (name="guatemala")
    private BigDecimal guatemala;
    @Column (name="guinea")
    private BigDecimal guinea;
    @Column (name="guinea_bissau")
    private BigDecimal guinea_bissau;
    @Column (name="guyana")
    private BigDecimal guyana;
    @Column (name="haiti")
    private BigDecimal haiti;
    @Column (name="honduras")
    private BigDecimal honduras;
    @Column (name="hong_kong")
    private BigDecimal hong_kong;
    @Column (name="hungary")
    private BigDecimal hungary;
    @Column (name="iceland")
    private BigDecimal iceland;
    @Column (name="india")
    private BigDecimal india;
    @Column (name="indonesia")
    private BigDecimal indonesia;
    @Column (name="iran")
    private BigDecimal iran;
    @Column (name="iraq")
    private BigDecimal iraq;
    @Column (name="ireland")
    private BigDecimal ireland;
    @Column (name="israel")
    private BigDecimal israel;
    @Column (name="italy")
    private BigDecimal italy;
    @Column (name="jamaica")
    private BigDecimal jamaica;
    @Column (name="japan")
    private BigDecimal japan;
    @Column (name="jordan")
    private BigDecimal jordan;
    @Column (name="kazakhstan")
    private BigDecimal kazakhstan;
    @Column (name="kenya")
    private BigDecimal kenya;
    @Column (name="kiribati")
    private BigDecimal kiribati;
    @Column (name="kuwait")
    private BigDecimal kuwait;
    @Column (name="kosovo")
    private BigDecimal kosovo;
    @Column (name="kyrgyzstan")
    private BigDecimal kyrgyzstan;
    @Column (name="laos")
    private BigDecimal laos;
    @Column (name="latvia")
    private BigDecimal latvia;
    @Column (name="lebanon")
    private BigDecimal lebanon;
    @Column (name="lesotho")
    private BigDecimal lesotho;
    @Column (name="liberia")
    private BigDecimal liberia;
    @Column (name="libya")
    private BigDecimal libya;
    @Column (name="liechtenstein")
    private BigDecimal liechtenstein;
    @Column (name="lithuania")
    private BigDecimal lithuania;
    @Column (name="luxembourg")
    private BigDecimal luxembourg;
    @Column (name="macao")
    private BigDecimal macao;
    @Column (name="north_macedonia")
    private BigDecimal north_macedonia;
    @Column (name="madagascar")
    private BigDecimal madagascar;
    @Column (name="malawi")
    private BigDecimal malawi;
    @Column (name="malaysia")
    private BigDecimal malaysia;
    @Column (name="maldives")
    private BigDecimal maldives;
    @Column (name="mali")
    private BigDecimal mali;
    @Column (name="malta")
    private BigDecimal malta;
    @Column (name="marshall_islands")
    private BigDecimal marshall_islands;
    @Column (name="martinique")
    private BigDecimal martinique;
    @Column (name="mauritania") 
    private BigDecimal mauritania;
    @Column (name="mauritius")  
    private BigDecimal mauritius;
    @Column (name="mayotte")
    private BigDecimal mayotte;
    @Column (name="mexico")
    private BigDecimal mexico;
    @Column (name="mongolia")
    private BigDecimal mongolia;
    @Column (name="montenegro")
    private BigDecimal montenegro;
    @Column (name="montserrat")
    private BigDecimal montserrat;
    @Column (name="morocco")
    private BigDecimal morocco;
    @Column (name="mozambique")
    private BigDecimal mozambique;
    @Column (name="myanmar")
    private BigDecimal myanmar;
    @Column (name="namibia")
    private BigDecimal namibia;
    @Column (name="nauru")
    private BigDecimal nauru;
    @Column (name="nepal")
    private BigDecimal nepal;
    @Column (name="netherlands")
    private BigDecimal netherlands;
    @Column (name="new_caledonia")
    private BigDecimal new_caledonia;
    @Column (name="new_zealand")
    private BigDecimal new_zealand;
    @Column (name="nicaragua")
    private BigDecimal nicaragua;
    @Column (name="niger")
    private BigDecimal niger;
    @Column (name="nigeria")
    private BigDecimal nigeria;
    @Column (name="niue")
    private BigDecimal niue;
    @Column (name="norway")
    private BigDecimal norway;
    @Column (name="occupied_palestinian_territory")
    private BigDecimal occupied_palestinian_territory;
    @Column (name="oman")
    private BigDecimal oman;
    @Column (name="pakistan")
    private BigDecimal pakistan;
    @Column (name="palau")
    private BigDecimal palau;
    @Column (name="panama")
    private BigDecimal panama;
    @Column (name="papua_new_guinea")
    private BigDecimal papua_new_guinea;
    @Column (name="paraguay")
    private BigDecimal paraguay;
    @Column (name="peru")
    private BigDecimal peru;
    @Column (name="philippines")
    private BigDecimal philippines;
    @Column (name="bolivia")
    private BigDecimal bolivia;
    @Column (name="poland")
    private BigDecimal poland;
    @Column (name="portugal")
    private BigDecimal portugal;
    @Column (name="qatar")
    private BigDecimal qatar;
    @Column (name="cameroon")
    private BigDecimal cameroon;
    @Column (name="south_korea")
    private BigDecimal south_korea;
    @Column (name="moldova")
    private BigDecimal moldova;
    @Column (name="south_sudan")
    private BigDecimal south_sudan;
    @Column (name="réunio")
    private BigDecimal réunion;
    @Column (name="sudan")
    private BigDecimal sudan;
    @Column (name="romania")
    private BigDecimal romania;
    @Column (name="russian_federation")
    private BigDecimal russian_federation;
    @Column (name="rwanda") 
    private BigDecimal rwanda;
    @Column (name="saint_helena")
    private BigDecimal saint_helena;
    @Column (name="saint_lucia")
    private BigDecimal saint_lucia;
    @Column (name="sint_maarten_dutch_part")
    private BigDecimal sint_maarten_dutch_part;
    @Column (name="samoa")
    private BigDecimal samoa;
    @Column (name="sao_tome_and_principe")
    private BigDecimal sao_tome_and_principe;
    @Column (name="saudi_arabia")
    private BigDecimal saudi_arabia;
    @Column (name="senegal")
    private BigDecimal senegal;
    @Column (name="serbia")
    private BigDecimal serbia;
    @Column (name="seychelles")
    private BigDecimal seychelles;
    @Column (name="sierra_leone")
    private BigDecimal sierra_leone;
    @Column (name="singapore")
    private BigDecimal singapore;
    @Column (name="slovakia")
    private BigDecimal slovakia;
    @Column (name="slovenia")
    private BigDecimal slovenia;
    @Column (name="solomon_islands")
    private BigDecimal solomon_islands;
    @Column (name="somalia")
    private BigDecimal somalia;
    @Column (name="south_africa")
    private BigDecimal south_africa;
    @Column (name="spain")
    private BigDecimal spain;
    @Column (name="sri_lanka")
    private BigDecimal sri_lanka;
    @Column (name="saint_kitts_and_nevis")
    private BigDecimal saint_kitts_and_nevis;
    @Column (name="saint_pierre_and_miquelon")
    private BigDecimal saint_pierre_and_miquelon;
    @Column (name="saint_vincent_and_the_grenadines")
    private BigDecimal saint_vincent_and_the_grenadines;
    @Column (name="suriname ")
    private BigDecimal suriname;
    @Column (name="swaziland")
    private BigDecimal swaziland;
    @Column (name="sweden")
    private BigDecimal sweden;
    @Column (name="switzerland")
    private BigDecimal switzerland;
    @Column (name="syria")
    private BigDecimal syria;
    @Column (name="taiwan")
    private BigDecimal taiwan;
    @Column (name="tajikistan")
    private BigDecimal tajikistan;
    @Column (name="thailand")
    private BigDecimal thailand;
    @Column (name="togo")
    private BigDecimal togo;
    @Column (name="tonga")
    private BigDecimal tonga;
    @Column (name="trinidad_and_tobago")
    private BigDecimal trinidad_and_tobago;
    @Column (name="tunisia")
    private BigDecimal tunisia;
    @Column (name="turkey")
    private BigDecimal turkey;
    @Column (name="turkmenistan")
    private BigDecimal turkmenistan;
    @Column (name="timor-leste")
    private BigDecimal timor_leste;
    @Column (name="tuvalu") 
    private BigDecimal tuvalu;
    @Column (name="turks_and_caicos_islands")
    private BigDecimal turks_and_caicos_islands;
    @Column (name="uganda")
    private BigDecimal uganda;
    @Column (name="ukraine")
    private BigDecimal ukraine;
    @Column (name="united_arab_emirates")
    private BigDecimal united_arab_emirates;
    @Column (name="united_kingdom")
    private BigDecimal united_kingdom;
    @Column (name="tanzania")
    private BigDecimal tanzania;
    @Column (name="usa")
    private BigDecimal usa;
    @Column (name="uruguay")
    private BigDecimal uruguay;
    @Column (name="uzbekistan")
    private BigDecimal uzbekistan;
    @Column (name="vanuatu")
    private BigDecimal vanuatu;
    @Column (name="venezuela")
    private BigDecimal venezuela;
    @Column (name="viet_nam")   
    private BigDecimal viet_nam;
    @Column (name="wallis_and_futuna_islands")
    private BigDecimal wallis_and_futuna_islands;
    @Column (name="yemen")
    private BigDecimal yemen;
    @Column (name="zambia")
    private BigDecimal zambia;
    @Column (name="zimbabwe")
    private BigDecimal zimbabwe;
    @Column (name="year")
    private float year;
    @Column (name="anguilla")
    private BigDecimal anguilla;


    public Visualizations() {
    }

    public Visualizations(Integer id, String date, String time_type, BigDecimal globald, BigDecimal northernd, BigDecimal southernd, BigDecimal globalc, BigDecimal annualavg, BigDecimal monthlyavg, String sub_sector, String sector, BigDecimal sub_percent, BigDecimal sector_percent, BigDecimal afghanistan, BigDecimal albania, BigDecimal algeria, BigDecimal andorra, BigDecimal angola, BigDecimal antigua_and_barbuda, BigDecimal argentina, BigDecimal armenia, BigDecimal aruba, BigDecimal australia, BigDecimal austria, BigDecimal azerbaijan, BigDecimal bahamas, BigDecimal bahrain, BigDecimal bangladesh, BigDecimal barbados, BigDecimal belarus, BigDecimal belgium, BigDecimal belize, BigDecimal benin, BigDecimal bermuda, BigDecimal bhutan, BigDecimal bonaire__saint_eustatius_and_saba, BigDecimal bosnia_and_herzegovina, BigDecimal botswana, BigDecimal brazil, BigDecimal british_virgin_islands, BigDecimal brunei_darussalam, BigDecimal bulgaria, BigDecimal burkina_faso, BigDecimal burundi, BigDecimal cambodia, BigDecimal canada, BigDecimal cape_verde, BigDecimal central_african_republic, BigDecimal chad, BigDecimal chile, BigDecimal china, BigDecimal colombia, BigDecimal comoros, BigDecimal congo, BigDecimal cook_islands, BigDecimal costa_rica, BigDecimal côte_divoire, BigDecimal croatia, BigDecimal cuba, BigDecimal curaçao, BigDecimal cyprus, BigDecimal czech_republic, BigDecimal north_korea, BigDecimal democratic_republic_of_the_congo, BigDecimal denmark, BigDecimal djibouti, BigDecimal dominica, BigDecimal dominican_republic, BigDecimal ecuador, BigDecimal egypt, BigDecimal el_salvador, BigDecimal equatorial_guinea, BigDecimal eritrea, BigDecimal estonia, BigDecimal ethiopia, BigDecimal faeroe_islands, BigDecimal micronesia, BigDecimal fiji, BigDecimal finland, BigDecimal france, BigDecimal french_guiana, BigDecimal french_polynesia, BigDecimal gabon, BigDecimal gambia, BigDecimal georgia, BigDecimal germany, BigDecimal ghana, BigDecimal greece, BigDecimal greenland, BigDecimal grenada, BigDecimal guadeloupe, BigDecimal guatemala, BigDecimal guinea, BigDecimal guinea_bissau, BigDecimal guyana, BigDecimal haiti, BigDecimal honduras, BigDecimal hong_kong, BigDecimal hungary, BigDecimal iceland, BigDecimal india, BigDecimal indonesia, BigDecimal iran, BigDecimal iraq, BigDecimal ireland, BigDecimal israel, BigDecimal italy, BigDecimal jamaica, BigDecimal japan, BigDecimal jordan, BigDecimal kazakhstan, BigDecimal kenya, BigDecimal kiribati, BigDecimal kuwait, BigDecimal kosovo, BigDecimal kyrgyzstan, BigDecimal laos, BigDecimal latvia, BigDecimal lebanon, BigDecimal lesotho, BigDecimal liberia, BigDecimal libya, BigDecimal liechtenstein, BigDecimal lithuania, BigDecimal luxembourg, BigDecimal macao, BigDecimal north_macedonia, BigDecimal madagascar, BigDecimal malawi, BigDecimal malaysia, BigDecimal maldives, BigDecimal mali, BigDecimal malta, BigDecimal marshall_islands, BigDecimal martinique, BigDecimal mauritania, BigDecimal mauritius, BigDecimal mayotte, BigDecimal mexico, BigDecimal mongolia, BigDecimal montenegro, BigDecimal montserrat, BigDecimal morocco, BigDecimal mozambique, BigDecimal myanmar, BigDecimal namibia, BigDecimal nauru, BigDecimal nepal, BigDecimal netherlands, BigDecimal new_caledonia, BigDecimal new_zealand, BigDecimal nicaragua, BigDecimal niger, BigDecimal nigeria, BigDecimal niue, BigDecimal norway, BigDecimal occupied_palestinian_territory, BigDecimal oman, BigDecimal pakistan, BigDecimal palau, BigDecimal panama, BigDecimal papua_new_guinea, BigDecimal paraguay, BigDecimal peru, BigDecimal philippines, BigDecimal bolivia, BigDecimal poland, BigDecimal portugal, BigDecimal qatar, BigDecimal cameroon, BigDecimal south_korea, BigDecimal moldova, BigDecimal south_sudan, BigDecimal réunion, BigDecimal sudan, BigDecimal romania, BigDecimal russian_federation, BigDecimal rwanda, BigDecimal saint_helena, BigDecimal saint_lucia, BigDecimal sint_maarten_dutch_part, BigDecimal samoa, BigDecimal sao_tome_and_principe, BigDecimal saudi_arabia, BigDecimal senegal, BigDecimal serbia, BigDecimal seychelles, BigDecimal sierra_leone, BigDecimal singapore, BigDecimal slovakia, BigDecimal slovenia, BigDecimal solomon_islands, BigDecimal somalia, BigDecimal south_africa, BigDecimal spain, BigDecimal sri_lanka, BigDecimal saint_kitts_and_nevis, BigDecimal saint_pierre_and_miquelon, BigDecimal saint_vincent_and_the_grenadines, BigDecimal suriname, BigDecimal swaziland, BigDecimal sweden, BigDecimal switzerland, BigDecimal syria, BigDecimal taiwan, BigDecimal tajikistan, BigDecimal thailand, BigDecimal togo, BigDecimal tonga, BigDecimal trinidad_and_tobago, BigDecimal tunisia, BigDecimal turkey, BigDecimal turkmenistan, BigDecimal timor_leste, BigDecimal tuvalu, BigDecimal turks_and_caicos_islands, BigDecimal uganda, BigDecimal ukraine, BigDecimal united_arab_emirates, BigDecimal united_kingdom, BigDecimal tanzania, BigDecimal usa, BigDecimal uruguay, BigDecimal uzbekistan, BigDecimal vanuatu, BigDecimal venezuela, BigDecimal viet_nam, BigDecimal wallis_and_futuna_islands, BigDecimal yemen, BigDecimal zambia, BigDecimal zimbabwe, float year, BigDecimal anguilla) {
        this.id = id;
        this.date = date;
        this.time_type = time_type;
        this.globald = globald;
        this.northernd = northernd;
        this.southernd = southernd;
        this.globalc = globalc;
        this.annualavg = annualavg;
        this.monthlyavg = monthlyavg;
        this.sub_sector = sub_sector;
        this.sector = sector;
        this.sub_percent = sub_percent;
        this.sector_percent = sector_percent;
        this.afghanistan = afghanistan;
        this.albania = albania;
        this.algeria = algeria;
        this.andorra = andorra;
        this.angola = angola;
        this.antigua_and_barbuda = antigua_and_barbuda;
        this.argentina = argentina;
        this.armenia = armenia;
        this.aruba = aruba;
        this.australia = australia;
        this.austria = austria;
        this.azerbaijan = azerbaijan;
        this.bahamas = bahamas;
        this.bahrain = bahrain;
        this.bangladesh = bangladesh;
        this.barbados = barbados;
        this.belarus = belarus;
        this.belgium = belgium;
        this.belize = belize;
        this.benin = benin;
        this.bermuda = bermuda;
        this.bhutan = bhutan;
        this.bonaire__saint_eustatius_and_saba = bonaire__saint_eustatius_and_saba;
        this.bosnia_and_herzegovina = bosnia_and_herzegovina;
        this.botswana = botswana;
        this.brazil = brazil;
        this.british_virgin_islands = british_virgin_islands;
        this.brunei_darussalam = brunei_darussalam;
        this.bulgaria = bulgaria;
        this.burkina_faso = burkina_faso;
        this.burundi = burundi;
        this.cambodia = cambodia;
        this.canada = canada;
        this.cape_verde = cape_verde;
        this.central_african_republic = central_african_republic;
        this.chad = chad;
        this.chile = chile;
        this.china = china;
        this.colombia = colombia;
        this.comoros = comoros;
        this.congo = congo;
        this.cook_islands = cook_islands;
        this.costa_rica = costa_rica;
        this.côte_divoire = côte_divoire;
        this.croatia = croatia;
        this.cuba = cuba;
        this.curaçao = curaçao;
        this.cyprus = cyprus;
        this.czech_republic = czech_republic;
        this.north_korea = north_korea;
        this.democratic_republic_of_the_congo = democratic_republic_of_the_congo;
        this.denmark = denmark;
        this.djibouti = djibouti;
        this.dominica = dominica;
        this.dominican_republic = dominican_republic;
        this.ecuador = ecuador;
        this.egypt = egypt;
        this.el_salvador = el_salvador;
        this.equatorial_guinea = equatorial_guinea;
        this.eritrea = eritrea;
        this.estonia = estonia;
        this.ethiopia = ethiopia;
        this.faeroe_islands = faeroe_islands;
        this.micronesia = micronesia;
        this.fiji = fiji;
        this.finland = finland;
        this.france = france;
        this.french_guiana = french_guiana;
        this.french_polynesia = french_polynesia;
        this.gabon = gabon;
        this.gambia = gambia;
        this.georgia = georgia;
        this.germany = germany;
        this.ghana = ghana;
        this.greece = greece;
        this.greenland = greenland;
        this.grenada = grenada;
        this.guadeloupe = guadeloupe;
        this.guatemala = guatemala;
        this.guinea = guinea;
        this.guinea_bissau = guinea_bissau;
        this.guyana = guyana;
        this.haiti = haiti;
        this.honduras = honduras;
        this.hong_kong = hong_kong;
        this.hungary = hungary;
        this.iceland = iceland;
        this.india = india;
        this.indonesia = indonesia;
        this.iran = iran;
        this.iraq = iraq;
        this.ireland = ireland;
        this.israel = israel;
        this.italy = italy;
        this.jamaica = jamaica;
        this.japan = japan;
        this.jordan = jordan;
        this.kazakhstan = kazakhstan;
        this.kenya = kenya;
        this.kiribati = kiribati;
        this.kuwait = kuwait;
        this.kosovo = kosovo;
        this.kyrgyzstan = kyrgyzstan;
        this.laos = laos;
        this.latvia = latvia;
        this.lebanon = lebanon;
        this.lesotho = lesotho;
        this.liberia = liberia;
        this.libya = libya;
        this.liechtenstein = liechtenstein;
        this.lithuania = lithuania;
        this.luxembourg = luxembourg;
        this.macao = macao;
        this.north_macedonia = north_macedonia;
        this.madagascar = madagascar;
        this.malawi = malawi;
        this.malaysia = malaysia;
        this.maldives = maldives;
        this.mali = mali;
        this.malta = malta;
        this.marshall_islands = marshall_islands;
        this.martinique = martinique;
        this.mauritania = mauritania;
        this.mauritius = mauritius;
        this.mayotte = mayotte;
        this.mexico = mexico;
        this.mongolia = mongolia;
        this.montenegro = montenegro;
        this.montserrat = montserrat;
        this.morocco = morocco;
        this.mozambique = mozambique;
        this.myanmar = myanmar;
        this.namibia = namibia;
        this.nauru = nauru;
        this.nepal = nepal;
        this.netherlands = netherlands;
        this.new_caledonia = new_caledonia;
        this.new_zealand = new_zealand;
        this.nicaragua = nicaragua;
        this.niger = niger;
        this.nigeria = nigeria;
        this.niue = niue;
        this.norway = norway;
        this.occupied_palestinian_territory = occupied_palestinian_territory;
        this.oman = oman;
        this.pakistan = pakistan;
        this.palau = palau;
        this.panama = panama;
        this.papua_new_guinea = papua_new_guinea;
        this.paraguay = paraguay;
        this.peru = peru;
        this.philippines = philippines;
        this.bolivia = bolivia;
        this.poland = poland;
        this.portugal = portugal;
        this.qatar = qatar;
        this.cameroon = cameroon;
        this.south_korea = south_korea;
        this.moldova = moldova;
        this.south_sudan = south_sudan;
        this.réunion = réunion;
        this.sudan = sudan;
        this.romania = romania;
        this.russian_federation = russian_federation;
        this.rwanda = rwanda;
        this.saint_helena = saint_helena;
        this.saint_lucia = saint_lucia;
        this.sint_maarten_dutch_part = sint_maarten_dutch_part;
        this.samoa = samoa;
        this.sao_tome_and_principe = sao_tome_and_principe;
        this.saudi_arabia = saudi_arabia;
        this.senegal = senegal;
        this.serbia = serbia;
        this.seychelles = seychelles;
        this.sierra_leone = sierra_leone;
        this.singapore = singapore;
        this.slovakia = slovakia;
        this.slovenia = slovenia;
        this.solomon_islands = solomon_islands;
        this.somalia = somalia;
        this.south_africa = south_africa;
        this.spain = spain;
        this.sri_lanka = sri_lanka;
        this.saint_kitts_and_nevis = saint_kitts_and_nevis;
        this.saint_pierre_and_miquelon = saint_pierre_and_miquelon;
        this.saint_vincent_and_the_grenadines = saint_vincent_and_the_grenadines;
        this.suriname = suriname;
        this.swaziland = swaziland;
        this.sweden = sweden;
        this.switzerland = switzerland;
        this.syria = syria;
        this.taiwan = taiwan;
        this.tajikistan = tajikistan;
        this.thailand = thailand;
        this.togo = togo;
        this.tonga = tonga;
        this.trinidad_and_tobago = trinidad_and_tobago;
        this.tunisia = tunisia;
        this.turkey = turkey;
        this.turkmenistan = turkmenistan;
        this.timor_leste = timor_leste;
        this.tuvalu = tuvalu;
        this.turks_and_caicos_islands = turks_and_caicos_islands;
        this.uganda = uganda;
        this.ukraine = ukraine;
        this.united_arab_emirates = united_arab_emirates;
        this.united_kingdom = united_kingdom;
        this.tanzania = tanzania;
        this.usa = usa;
        this.uruguay = uruguay;
        this.uzbekistan = uzbekistan;
        this.vanuatu = vanuatu;
        this.venezuela = venezuela;
        this.viet_nam = viet_nam;
        this.wallis_and_futuna_islands = wallis_and_futuna_islands;
        this.yemen = yemen;
        this.zambia = zambia;
        this.zimbabwe = zimbabwe;
        this.year = year;
        this.anguilla = anguilla;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_type() {
        return this.time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
    }

    public BigDecimal getGlobald() {
        return this.globald;
    }

    public void setGlobald(BigDecimal globald) {
        this.globald = globald;
    }

    public BigDecimal getNorthernd() {
        return this.northernd;
    }

    public void setNorthernd(BigDecimal northernd) {
        this.northernd = northernd;
    }

    public BigDecimal getSouthernd() {
        return this.southernd;
    }

    public void setSouthernd(BigDecimal southernd) {
        this.southernd = southernd;
    }

    public BigDecimal getGlobalc() {
        return this.globalc;
    }

    public void setGlobalc(BigDecimal globalc) {
        this.globalc = globalc;
    }

    public BigDecimal getAnnualavg() {
        return this.annualavg;
    }

    public void setAnnualavg(BigDecimal annualavg) {
        this.annualavg = annualavg;
    }

    public BigDecimal getMonthlyavg() {
        return this.monthlyavg;
    }

    public void setMonthlyavg(BigDecimal monthlyavg) {
        this.monthlyavg = monthlyavg;
    }

    public String getSub_sector() {
        return this.sub_sector;
    }

    public void setSub_sector(String sub_sector) {
        this.sub_sector = sub_sector;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public BigDecimal getSub_percent() {
        return this.sub_percent;
    }

    public void setSub_percent(BigDecimal sub_percent) {
        this.sub_percent = sub_percent;
    }

    public BigDecimal getSector_percent() {
        return this.sector_percent;
    }

    public void setSector_percent(BigDecimal sector_percent) {
        this.sector_percent = sector_percent;
    }

    public BigDecimal getAfghanistan() {
        return this.afghanistan;
    }

    public void setAfghanistan(BigDecimal afghanistan) {
        this.afghanistan = afghanistan;
    }

    public BigDecimal getAlbania() {
        return this.albania;
    }

    public void setAlbania(BigDecimal albania) {
        this.albania = albania;
    }

    public BigDecimal getAlgeria() {
        return this.algeria;
    }

    public void setAlgeria(BigDecimal algeria) {
        this.algeria = algeria;
    }

    public BigDecimal getAndorra() {
        return this.andorra;
    }

    public void setAndorra(BigDecimal andorra) {
        this.andorra = andorra;
    }

    public BigDecimal getAngola() {
        return this.angola;
    }

    public void setAngola(BigDecimal angola) {
        this.angola = angola;
    }

    public BigDecimal getAntigua_and_barbuda() {
        return this.antigua_and_barbuda;
    }

    public void setAntigua_and_barbuda(BigDecimal antigua_and_barbuda) {
        this.antigua_and_barbuda = antigua_and_barbuda;
    }

    public BigDecimal getArgentina() {
        return this.argentina;
    }

    public void setArgentina(BigDecimal argentina) {
        this.argentina = argentina;
    }

    public BigDecimal getArmenia() {
        return this.armenia;
    }

    public void setArmenia(BigDecimal armenia) {
        this.armenia = armenia;
    }

    public BigDecimal getAruba() {
        return this.aruba;
    }

    public void setAruba(BigDecimal aruba) {
        this.aruba = aruba;
    }

    public BigDecimal getAustralia() {
        return this.australia;
    }

    public void setAustralia(BigDecimal australia) {
        this.australia = australia;
    }

    public BigDecimal getAustria() {
        return this.austria;
    }

    public void setAustria(BigDecimal austria) {
        this.austria = austria;
    }

    public BigDecimal getAzerbaijan() {
        return this.azerbaijan;
    }

    public void setAzerbaijan(BigDecimal azerbaijan) {
        this.azerbaijan = azerbaijan;
    }

    public BigDecimal getBahamas() {
        return this.bahamas;
    }

    public void setBahamas(BigDecimal bahamas) {
        this.bahamas = bahamas;
    }

    public BigDecimal getBahrain() {
        return this.bahrain;
    }

    public void setBahrain(BigDecimal bahrain) {
        this.bahrain = bahrain;
    }

    public BigDecimal getBangladesh() {
        return this.bangladesh;
    }

    public void setBangladesh(BigDecimal bangladesh) {
        this.bangladesh = bangladesh;
    }

    public BigDecimal getBarbados() {
        return this.barbados;
    }

    public void setBarbados(BigDecimal barbados) {
        this.barbados = barbados;
    }

    public BigDecimal getBelarus() {
        return this.belarus;
    }

    public void setBelarus(BigDecimal belarus) {
        this.belarus = belarus;
    }

    public BigDecimal getBelgium() {
        return this.belgium;
    }

    public void setBelgium(BigDecimal belgium) {
        this.belgium = belgium;
    }

    public BigDecimal getBelize() {
        return this.belize;
    }

    public void setBelize(BigDecimal belize) {
        this.belize = belize;
    }

    public BigDecimal getBenin() {
        return this.benin;
    }

    public void setBenin(BigDecimal benin) {
        this.benin = benin;
    }

    public BigDecimal getBermuda() {
        return this.bermuda;
    }

    public void setBermuda(BigDecimal bermuda) {
        this.bermuda = bermuda;
    }

    public BigDecimal getBhutan() {
        return this.bhutan;
    }

    public void setBhutan(BigDecimal bhutan) {
        this.bhutan = bhutan;
    }

    public BigDecimal getBonaire__saint_eustatius_and_saba() {
        return this.bonaire__saint_eustatius_and_saba;
    }

    public void setBonaire__saint_eustatius_and_saba(BigDecimal bonaire__saint_eustatius_and_saba) {
        this.bonaire__saint_eustatius_and_saba = bonaire__saint_eustatius_and_saba;
    }

    public BigDecimal getBosnia_and_herzegovina() {
        return this.bosnia_and_herzegovina;
    }

    public void setBosnia_and_herzegovina(BigDecimal bosnia_and_herzegovina) {
        this.bosnia_and_herzegovina = bosnia_and_herzegovina;
    }

    public BigDecimal getBotswana() {
        return this.botswana;
    }

    public void setBotswana(BigDecimal botswana) {
        this.botswana = botswana;
    }

    public BigDecimal getBrazil() {
        return this.brazil;
    }

    public void setBrazil(BigDecimal brazil) {
        this.brazil = brazil;
    }

    public BigDecimal getBritish_virgin_islands() {
        return this.british_virgin_islands;
    }

    public void setBritish_virgin_islands(BigDecimal british_virgin_islands) {
        this.british_virgin_islands = british_virgin_islands;
    }

    public BigDecimal getBrunei_darussalam() {
        return this.brunei_darussalam;
    }

    public void setBrunei_darussalam(BigDecimal brunei_darussalam) {
        this.brunei_darussalam = brunei_darussalam;
    }

    public BigDecimal getBulgaria() {
        return this.bulgaria;
    }

    public void setBulgaria(BigDecimal bulgaria) {
        this.bulgaria = bulgaria;
    }

    public BigDecimal getBurkina_faso() {
        return this.burkina_faso;
    }

    public void setBurkina_faso(BigDecimal burkina_faso) {
        this.burkina_faso = burkina_faso;
    }

    public BigDecimal getBurundi() {
        return this.burundi;
    }

    public void setBurundi(BigDecimal burundi) {
        this.burundi = burundi;
    }

    public BigDecimal getCambodia() {
        return this.cambodia;
    }

    public void setCambodia(BigDecimal cambodia) {
        this.cambodia = cambodia;
    }

    public BigDecimal getCanada() {
        return this.canada;
    }

    public void setCanada(BigDecimal canada) {
        this.canada = canada;
    }

    public BigDecimal getCape_verde() {
        return this.cape_verde;
    }

    public void setCape_verde(BigDecimal cape_verde) {
        this.cape_verde = cape_verde;
    }

    public BigDecimal getCentral_african_republic() {
        return this.central_african_republic;
    }

    public void setCentral_african_republic(BigDecimal central_african_republic) {
        this.central_african_republic = central_african_republic;
    }

    public BigDecimal getChad() {
        return this.chad;
    }

    public void setChad(BigDecimal chad) {
        this.chad = chad;
    }

    public BigDecimal getChile() {
        return this.chile;
    }

    public void setChile(BigDecimal chile) {
        this.chile = chile;
    }

    public BigDecimal getChina() {
        return this.china;
    }

    public void setChina(BigDecimal china) {
        this.china = china;
    }

    public BigDecimal getColombia() {
        return this.colombia;
    }

    public void setColombia(BigDecimal colombia) {
        this.colombia = colombia;
    }

    public BigDecimal getComoros() {
        return this.comoros;
    }

    public void setComoros(BigDecimal comoros) {
        this.comoros = comoros;
    }

    public BigDecimal getCongo() {
        return this.congo;
    }

    public void setCongo(BigDecimal congo) {
        this.congo = congo;
    }

    public BigDecimal getCook_islands() {
        return this.cook_islands;
    }

    public void setCook_islands(BigDecimal cook_islands) {
        this.cook_islands = cook_islands;
    }

    public BigDecimal getCosta_rica() {
        return this.costa_rica;
    }

    public void setCosta_rica(BigDecimal costa_rica) {
        this.costa_rica = costa_rica;
    }

    public BigDecimal getCôte_divoire() {
        return this.côte_divoire;
    }

    public void setCôte_divoire(BigDecimal côte_divoire) {
        this.côte_divoire = côte_divoire;
    }

    public BigDecimal getCroatia() {
        return this.croatia;
    }

    public void setCroatia(BigDecimal croatia) {
        this.croatia = croatia;
    }

    public BigDecimal getCuba() {
        return this.cuba;
    }

    public void setCuba(BigDecimal cuba) {
        this.cuba = cuba;
    }

    public BigDecimal getCuraçao() {
        return this.curaçao;
    }

    public void setCuraçao(BigDecimal curaçao) {
        this.curaçao = curaçao;
    }

    public BigDecimal getCyprus() {
        return this.cyprus;
    }

    public void setCyprus(BigDecimal cyprus) {
        this.cyprus = cyprus;
    }

    public BigDecimal getCzech_republic() {
        return this.czech_republic;
    }

    public void setCzech_republic(BigDecimal czech_republic) {
        this.czech_republic = czech_republic;
    }

    public BigDecimal getNorth_korea() {
        return this.north_korea;
    }

    public void setNorth_korea(BigDecimal north_korea) {
        this.north_korea = north_korea;
    }

    public BigDecimal getDemocratic_republic_of_the_congo() {
        return this.democratic_republic_of_the_congo;
    }

    public void setDemocratic_republic_of_the_congo(BigDecimal democratic_republic_of_the_congo) {
        this.democratic_republic_of_the_congo = democratic_republic_of_the_congo;
    }

    public BigDecimal getDenmark() {
        return this.denmark;
    }

    public void setDenmark(BigDecimal denmark) {
        this.denmark = denmark;
    }

    public BigDecimal getDjibouti() {
        return this.djibouti;
    }

    public void setDjibouti(BigDecimal djibouti) {
        this.djibouti = djibouti;
    }

    public BigDecimal getDominica() {
        return this.dominica;
    }

    public void setDominica(BigDecimal dominica) {
        this.dominica = dominica;
    }

    public BigDecimal getDominican_republic() {
        return this.dominican_republic;
    }

    public void setDominican_republic(BigDecimal dominican_republic) {
        this.dominican_republic = dominican_republic;
    }

    public BigDecimal getEcuador() {
        return this.ecuador;
    }

    public void setEcuador(BigDecimal ecuador) {
        this.ecuador = ecuador;
    }

    public BigDecimal getEgypt() {
        return this.egypt;
    }

    public void setEgypt(BigDecimal egypt) {
        this.egypt = egypt;
    }

    public BigDecimal getEl_salvador() {
        return this.el_salvador;
    }

    public void setEl_salvador(BigDecimal el_salvador) {
        this.el_salvador = el_salvador;
    }

    public BigDecimal getEquatorial_guinea() {
        return this.equatorial_guinea;
    }

    public void setEquatorial_guinea(BigDecimal equatorial_guinea) {
        this.equatorial_guinea = equatorial_guinea;
    }

    public BigDecimal getEritrea() {
        return this.eritrea;
    }

    public void setEritrea(BigDecimal eritrea) {
        this.eritrea = eritrea;
    }

    public BigDecimal getEstonia() {
        return this.estonia;
    }

    public void setEstonia(BigDecimal estonia) {
        this.estonia = estonia;
    }

    public BigDecimal getEthiopia() {
        return this.ethiopia;
    }

    public void setEthiopia(BigDecimal ethiopia) {
        this.ethiopia = ethiopia;
    }

    public BigDecimal getFaeroe_islands() {
        return this.faeroe_islands;
    }

    public void setFaeroe_islands(BigDecimal faeroe_islands) {
        this.faeroe_islands = faeroe_islands;
    }

    public BigDecimal getMicronesia() {
        return this.micronesia;
    }

    public void setMicronesia(BigDecimal micronesia) {
        this.micronesia = micronesia;
    }

    public BigDecimal getFiji() {
        return this.fiji;
    }

    public void setFiji(BigDecimal fiji) {
        this.fiji = fiji;
    }

    public BigDecimal getFinland() {
        return this.finland;
    }

    public void setFinland(BigDecimal finland) {
        this.finland = finland;
    }

    public BigDecimal getFrance() {
        return this.france;
    }

    public void setFrance(BigDecimal france) {
        this.france = france;
    }

    public BigDecimal getFrench_guiana() {
        return this.french_guiana;
    }

    public void setFrench_guiana(BigDecimal french_guiana) {
        this.french_guiana = french_guiana;
    }

    public BigDecimal getFrench_polynesia() {
        return this.french_polynesia;
    }

    public void setFrench_polynesia(BigDecimal french_polynesia) {
        this.french_polynesia = french_polynesia;
    }

    public BigDecimal getGabon() {
        return this.gabon;
    }

    public void setGabon(BigDecimal gabon) {
        this.gabon = gabon;
    }

    public BigDecimal getGambia() {
        return this.gambia;
    }

    public void setGambia(BigDecimal gambia) {
        this.gambia = gambia;
    }

    public BigDecimal getGeorgia() {
        return this.georgia;
    }

    public void setGeorgia(BigDecimal georgia) {
        this.georgia = georgia;
    }

    public BigDecimal getGermany() {
        return this.germany;
    }

    public void setGermany(BigDecimal germany) {
        this.germany = germany;
    }

    public BigDecimal getGhana() {
        return this.ghana;
    }

    public void setGhana(BigDecimal ghana) {
        this.ghana = ghana;
    }

    public BigDecimal getGreece() {
        return this.greece;
    }

    public void setGreece(BigDecimal greece) {
        this.greece = greece;
    }

    public BigDecimal getGreenland() {
        return this.greenland;
    }

    public void setGreenland(BigDecimal greenland) {
        this.greenland = greenland;
    }

    public BigDecimal getGrenada() {
        return this.grenada;
    }

    public void setGrenada(BigDecimal grenada) {
        this.grenada = grenada;
    }

    public BigDecimal getGuadeloupe() {
        return this.guadeloupe;
    }

    public void setGuadeloupe(BigDecimal guadeloupe) {
        this.guadeloupe = guadeloupe;
    }

    public BigDecimal getGuatemala() {
        return this.guatemala;
    }

    public void setGuatemala(BigDecimal guatemala) {
        this.guatemala = guatemala;
    }

    public BigDecimal getGuinea() {
        return this.guinea;
    }

    public void setGuinea(BigDecimal guinea) {
        this.guinea = guinea;
    }

    public BigDecimal getGuinea_bissau() {
        return this.guinea_bissau;
    }

    public void setGuinea_bissau(BigDecimal guinea_bissau) {
        this.guinea_bissau = guinea_bissau;
    }

    public BigDecimal getGuyana() {
        return this.guyana;
    }

    public void setGuyana(BigDecimal guyana) {
        this.guyana = guyana;
    }

    public BigDecimal getHaiti() {
        return this.haiti;
    }

    public void setHaiti(BigDecimal haiti) {
        this.haiti = haiti;
    }

    public BigDecimal getHonduras() {
        return this.honduras;
    }

    public void setHonduras(BigDecimal honduras) {
        this.honduras = honduras;
    }

    public BigDecimal getHong_kong() {
        return this.hong_kong;
    }

    public void setHong_kong(BigDecimal hong_kong) {
        this.hong_kong = hong_kong;
    }

    public BigDecimal getHungary() {
        return this.hungary;
    }

    public void setHungary(BigDecimal hungary) {
        this.hungary = hungary;
    }

    public BigDecimal getIceland() {
        return this.iceland;
    }

    public void setIceland(BigDecimal iceland) {
        this.iceland = iceland;
    }

    public BigDecimal getIndia() {
        return this.india;
    }

    public void setIndia(BigDecimal india) {
        this.india = india;
    }

    public BigDecimal getIndonesia() {
        return this.indonesia;
    }

    public void setIndonesia(BigDecimal indonesia) {
        this.indonesia = indonesia;
    }

    public BigDecimal getIran() {
        return this.iran;
    }

    public void setIran(BigDecimal iran) {
        this.iran = iran;
    }

    public BigDecimal getIraq() {
        return this.iraq;
    }

    public void setIraq(BigDecimal iraq) {
        this.iraq = iraq;
    }

    public BigDecimal getIreland() {
        return this.ireland;
    }

    public void setIreland(BigDecimal ireland) {
        this.ireland = ireland;
    }

    public BigDecimal getIsrael() {
        return this.israel;
    }

    public void setIsrael(BigDecimal israel) {
        this.israel = israel;
    }

    public BigDecimal getItaly() {
        return this.italy;
    }

    public void setItaly(BigDecimal italy) {
        this.italy = italy;
    }

    public BigDecimal getJamaica() {
        return this.jamaica;
    }

    public void setJamaica(BigDecimal jamaica) {
        this.jamaica = jamaica;
    }

    public BigDecimal getJapan() {
        return this.japan;
    }

    public void setJapan(BigDecimal japan) {
        this.japan = japan;
    }

    public BigDecimal getJordan() {
        return this.jordan;
    }

    public void setJordan(BigDecimal jordan) {
        this.jordan = jordan;
    }

    public BigDecimal getKazakhstan() {
        return this.kazakhstan;
    }

    public void setKazakhstan(BigDecimal kazakhstan) {
        this.kazakhstan = kazakhstan;
    }

    public BigDecimal getKenya() {
        return this.kenya;
    }

    public void setKenya(BigDecimal kenya) {
        this.kenya = kenya;
    }

    public BigDecimal getKiribati() {
        return this.kiribati;
    }

    public void setKiribati(BigDecimal kiribati) {
        this.kiribati = kiribati;
    }

    public BigDecimal getKuwait() {
        return this.kuwait;
    }

    public void setKuwait(BigDecimal kuwait) {
        this.kuwait = kuwait;
    }

    public BigDecimal getKosovo() {
        return this.kosovo;
    }

    public void setKosovo(BigDecimal kosovo) {
        this.kosovo = kosovo;
    }

    public BigDecimal getKyrgyzstan() {
        return this.kyrgyzstan;
    }

    public void setKyrgyzstan(BigDecimal kyrgyzstan) {
        this.kyrgyzstan = kyrgyzstan;
    }

    public BigDecimal getLaos() {
        return this.laos;
    }

    public void setLaos(BigDecimal laos) {
        this.laos = laos;
    }

    public BigDecimal getLatvia() {
        return this.latvia;
    }

    public void setLatvia(BigDecimal latvia) {
        this.latvia = latvia;
    }

    public BigDecimal getLebanon() {
        return this.lebanon;
    }

    public void setLebanon(BigDecimal lebanon) {
        this.lebanon = lebanon;
    }

    public BigDecimal getLesotho() {
        return this.lesotho;
    }

    public void setLesotho(BigDecimal lesotho) {
        this.lesotho = lesotho;
    }

    public BigDecimal getLiberia() {
        return this.liberia;
    }

    public void setLiberia(BigDecimal liberia) {
        this.liberia = liberia;
    }

    public BigDecimal getLibya() {
        return this.libya;
    }

    public void setLibya(BigDecimal libya) {
        this.libya = libya;
    }

    public BigDecimal getLiechtenstein() {
        return this.liechtenstein;
    }

    public void setLiechtenstein(BigDecimal liechtenstein) {
        this.liechtenstein = liechtenstein;
    }

    public BigDecimal getLithuania() {
        return this.lithuania;
    }

    public void setLithuania(BigDecimal lithuania) {
        this.lithuania = lithuania;
    }

    public BigDecimal getLuxembourg() {
        return this.luxembourg;
    }

    public void setLuxembourg(BigDecimal luxembourg) {
        this.luxembourg = luxembourg;
    }

    public BigDecimal getMacao() {
        return this.macao;
    }

    public void setMacao(BigDecimal macao) {
        this.macao = macao;
    }

    public BigDecimal getNorth_macedonia() {
        return this.north_macedonia;
    }

    public void setNorth_macedonia(BigDecimal north_macedonia) {
        this.north_macedonia = north_macedonia;
    }

    public BigDecimal getMadagascar() {
        return this.madagascar;
    }

    public void setMadagascar(BigDecimal madagascar) {
        this.madagascar = madagascar;
    }

    public BigDecimal getMalawi() {
        return this.malawi;
    }

    public void setMalawi(BigDecimal malawi) {
        this.malawi = malawi;
    }

    public BigDecimal getMalaysia() {
        return this.malaysia;
    }

    public void setMalaysia(BigDecimal malaysia) {
        this.malaysia = malaysia;
    }

    public BigDecimal getMaldives() {
        return this.maldives;
    }

    public void setMaldives(BigDecimal maldives) {
        this.maldives = maldives;
    }

    public BigDecimal getMali() {
        return this.mali;
    }

    public void setMali(BigDecimal mali) {
        this.mali = mali;
    }

    public BigDecimal getMalta() {
        return this.malta;
    }

    public void setMalta(BigDecimal malta) {
        this.malta = malta;
    }

    public BigDecimal getMarshall_islands() {
        return this.marshall_islands;
    }

    public void setMarshall_islands(BigDecimal marshall_islands) {
        this.marshall_islands = marshall_islands;
    }

    public BigDecimal getMartinique() {
        return this.martinique;
    }

    public void setMartinique(BigDecimal martinique) {
        this.martinique = martinique;
    }

    public BigDecimal getMauritania() {
        return this.mauritania;
    }

    public void setMauritania(BigDecimal mauritania) {
        this.mauritania = mauritania;
    }

    public BigDecimal getMauritius() {
        return this.mauritius;
    }

    public void setMauritius(BigDecimal mauritius) {
        this.mauritius = mauritius;
    }

    public BigDecimal getMayotte() {
        return this.mayotte;
    }

    public void setMayotte(BigDecimal mayotte) {
        this.mayotte = mayotte;
    }

    public BigDecimal getMexico() {
        return this.mexico;
    }

    public void setMexico(BigDecimal mexico) {
        this.mexico = mexico;
    }

    public BigDecimal getMongolia() {
        return this.mongolia;
    }

    public void setMongolia(BigDecimal mongolia) {
        this.mongolia = mongolia;
    }

    public BigDecimal getMontenegro() {
        return this.montenegro;
    }

    public void setMontenegro(BigDecimal montenegro) {
        this.montenegro = montenegro;
    }

    public BigDecimal getMontserrat() {
        return this.montserrat;
    }

    public void setMontserrat(BigDecimal montserrat) {
        this.montserrat = montserrat;
    }

    public BigDecimal getMorocco() {
        return this.morocco;
    }

    public void setMorocco(BigDecimal morocco) {
        this.morocco = morocco;
    }

    public BigDecimal getMozambique() {
        return this.mozambique;
    }

    public void setMozambique(BigDecimal mozambique) {
        this.mozambique = mozambique;
    }

    public BigDecimal getMyanmar() {
        return this.myanmar;
    }

    public void setMyanmar(BigDecimal myanmar) {
        this.myanmar = myanmar;
    }

    public BigDecimal getNamibia() {
        return this.namibia;
    }

    public void setNamibia(BigDecimal namibia) {
        this.namibia = namibia;
    }

    public BigDecimal getNauru() {
        return this.nauru;
    }

    public void setNauru(BigDecimal nauru) {
        this.nauru = nauru;
    }

    public BigDecimal getNepal() {
        return this.nepal;
    }

    public void setNepal(BigDecimal nepal) {
        this.nepal = nepal;
    }

    public BigDecimal getNetherlands() {
        return this.netherlands;
    }

    public void setNetherlands(BigDecimal netherlands) {
        this.netherlands = netherlands;
    }

    public BigDecimal getNew_caledonia() {
        return this.new_caledonia;
    }

    public void setNew_caledonia(BigDecimal new_caledonia) {
        this.new_caledonia = new_caledonia;
    }

    public BigDecimal getNew_zealand() {
        return this.new_zealand;
    }

    public void setNew_zealand(BigDecimal new_zealand) {
        this.new_zealand = new_zealand;
    }

    public BigDecimal getNicaragua() {
        return this.nicaragua;
    }

    public void setNicaragua(BigDecimal nicaragua) {
        this.nicaragua = nicaragua;
    }

    public BigDecimal getNiger() {
        return this.niger;
    }

    public void setNiger(BigDecimal niger) {
        this.niger = niger;
    }

    public BigDecimal getNigeria() {
        return this.nigeria;
    }

    public void setNigeria(BigDecimal nigeria) {
        this.nigeria = nigeria;
    }

    public BigDecimal getNiue() {
        return this.niue;
    }

    public void setNiue(BigDecimal niue) {
        this.niue = niue;
    }

    public BigDecimal getNorway() {
        return this.norway;
    }

    public void setNorway(BigDecimal norway) {
        this.norway = norway;
    }

    public BigDecimal getOccupied_palestinian_territory() {
        return this.occupied_palestinian_territory;
    }

    public void setOccupied_palestinian_territory(BigDecimal occupied_palestinian_territory) {
        this.occupied_palestinian_territory = occupied_palestinian_territory;
    }

    public BigDecimal getOman() {
        return this.oman;
    }

    public void setOman(BigDecimal oman) {
        this.oman = oman;
    }

    public BigDecimal getPakistan() {
        return this.pakistan;
    }

    public void setPakistan(BigDecimal pakistan) {
        this.pakistan = pakistan;
    }

    public BigDecimal getPalau() {
        return this.palau;
    }

    public void setPalau(BigDecimal palau) {
        this.palau = palau;
    }

    public BigDecimal getPanama() {
        return this.panama;
    }

    public void setPanama(BigDecimal panama) {
        this.panama = panama;
    }

    public BigDecimal getPapua_new_guinea() {
        return this.papua_new_guinea;
    }

    public void setPapua_new_guinea(BigDecimal papua_new_guinea) {
        this.papua_new_guinea = papua_new_guinea;
    }

    public BigDecimal getParaguay() {
        return this.paraguay;
    }

    public void setParaguay(BigDecimal paraguay) {
        this.paraguay = paraguay;
    }

    public BigDecimal getPeru() {
        return this.peru;
    }

    public void setPeru(BigDecimal peru) {
        this.peru = peru;
    }

    public BigDecimal getPhilippines() {
        return this.philippines;
    }

    public void setPhilippines(BigDecimal philippines) {
        this.philippines = philippines;
    }

    public BigDecimal getBolivia() {
        return this.bolivia;
    }

    public void setBolivia(BigDecimal bolivia) {
        this.bolivia = bolivia;
    }

    public BigDecimal getPoland() {
        return this.poland;
    }

    public void setPoland(BigDecimal poland) {
        this.poland = poland;
    }

    public BigDecimal getPortugal() {
        return this.portugal;
    }

    public void setPortugal(BigDecimal portugal) {
        this.portugal = portugal;
    }

    public BigDecimal getQatar() {
        return this.qatar;
    }

    public void setQatar(BigDecimal qatar) {
        this.qatar = qatar;
    }

    public BigDecimal getCameroon() {
        return this.cameroon;
    }

    public void setCameroon(BigDecimal cameroon) {
        this.cameroon = cameroon;
    }

    public BigDecimal getSouth_korea() {
        return this.south_korea;
    }

    public void setSouth_korea(BigDecimal south_korea) {
        this.south_korea = south_korea;
    }

    public BigDecimal getMoldova() {
        return this.moldova;
    }

    public void setMoldova(BigDecimal moldova) {
        this.moldova = moldova;
    }

    public BigDecimal getSouth_sudan() {
        return this.south_sudan;
    }

    public void setSouth_sudan(BigDecimal south_sudan) {
        this.south_sudan = south_sudan;
    }

    public BigDecimal getRéunion() {
        return this.réunion;
    }

    public void setRéunion(BigDecimal réunion) {
        this.réunion = réunion;
    }

    public BigDecimal getSudan() {
        return this.sudan;
    }

    public void setSudan(BigDecimal sudan) {
        this.sudan = sudan;
    }

    public BigDecimal getRomania() {
        return this.romania;
    }

    public void setRomania(BigDecimal romania) {
        this.romania = romania;
    }

    public BigDecimal getRussian_federation() {
        return this.russian_federation;
    }

    public void setRussian_federation(BigDecimal russian_federation) {
        this.russian_federation = russian_federation;
    }

    public BigDecimal getRwanda() {
        return this.rwanda;
    }

    public void setRwanda(BigDecimal rwanda) {
        this.rwanda = rwanda;
    }

    public BigDecimal getSaint_helena() {
        return this.saint_helena;
    }

    public void setSaint_helena(BigDecimal saint_helena) {
        this.saint_helena = saint_helena;
    }

    public BigDecimal getSaint_lucia() {
        return this.saint_lucia;
    }

    public void setSaint_lucia(BigDecimal saint_lucia) {
        this.saint_lucia = saint_lucia;
    }

    public BigDecimal getSint_maarten_dutch_part() {
        return this.sint_maarten_dutch_part;
    }

    public void setSint_maarten_dutch_part(BigDecimal sint_maarten_dutch_part) {
        this.sint_maarten_dutch_part = sint_maarten_dutch_part;
    }

    public BigDecimal getSamoa() {
        return this.samoa;
    }

    public void setSamoa(BigDecimal samoa) {
        this.samoa = samoa;
    }

    public BigDecimal getSao_tome_and_principe() {
        return this.sao_tome_and_principe;
    }

    public void setSao_tome_and_principe(BigDecimal sao_tome_and_principe) {
        this.sao_tome_and_principe = sao_tome_and_principe;
    }

    public BigDecimal getSaudi_arabia() {
        return this.saudi_arabia;
    }

    public void setSaudi_arabia(BigDecimal saudi_arabia) {
        this.saudi_arabia = saudi_arabia;
    }

    public BigDecimal getSenegal() {
        return this.senegal;
    }

    public void setSenegal(BigDecimal senegal) {
        this.senegal = senegal;
    }

    public BigDecimal getSerbia() {
        return this.serbia;
    }

    public void setSerbia(BigDecimal serbia) {
        this.serbia = serbia;
    }

    public BigDecimal getSeychelles() {
        return this.seychelles;
    }

    public void setSeychelles(BigDecimal seychelles) {
        this.seychelles = seychelles;
    }

    public BigDecimal getSierra_leone() {
        return this.sierra_leone;
    }

    public void setSierra_leone(BigDecimal sierra_leone) {
        this.sierra_leone = sierra_leone;
    }

    public BigDecimal getSingapore() {
        return this.singapore;
    }

    public void setSingapore(BigDecimal singapore) {
        this.singapore = singapore;
    }

    public BigDecimal getSlovakia() {
        return this.slovakia;
    }

    public void setSlovakia(BigDecimal slovakia) {
        this.slovakia = slovakia;
    }

    public BigDecimal getSlovenia() {
        return this.slovenia;
    }

    public void setSlovenia(BigDecimal slovenia) {
        this.slovenia = slovenia;
    }

    public BigDecimal getSolomon_islands() {
        return this.solomon_islands;
    }

    public void setSolomon_islands(BigDecimal solomon_islands) {
        this.solomon_islands = solomon_islands;
    }

    public BigDecimal getSomalia() {
        return this.somalia;
    }

    public void setSomalia(BigDecimal somalia) {
        this.somalia = somalia;
    }

    public BigDecimal getSouth_africa() {
        return this.south_africa;
    }

    public void setSouth_africa(BigDecimal south_africa) {
        this.south_africa = south_africa;
    }

    public BigDecimal getSpain() {
        return this.spain;
    }

    public void setSpain(BigDecimal spain) {
        this.spain = spain;
    }

    public BigDecimal getSri_lanka() {
        return this.sri_lanka;
    }

    public void setSri_lanka(BigDecimal sri_lanka) {
        this.sri_lanka = sri_lanka;
    }

    public BigDecimal getSaint_kitts_and_nevis() {
        return this.saint_kitts_and_nevis;
    }

    public void setSaint_kitts_and_nevis(BigDecimal saint_kitts_and_nevis) {
        this.saint_kitts_and_nevis = saint_kitts_and_nevis;
    }

    public BigDecimal getSaint_pierre_and_miquelon() {
        return this.saint_pierre_and_miquelon;
    }

    public void setSaint_pierre_and_miquelon(BigDecimal saint_pierre_and_miquelon) {
        this.saint_pierre_and_miquelon = saint_pierre_and_miquelon;
    }

    public BigDecimal getSaint_vincent_and_the_grenadines() {
        return this.saint_vincent_and_the_grenadines;
    }

    public void setSaint_vincent_and_the_grenadines(BigDecimal saint_vincent_and_the_grenadines) {
        this.saint_vincent_and_the_grenadines = saint_vincent_and_the_grenadines;
    }

    public BigDecimal getSuriname() {
        return this.suriname;
    }

    public void setSuriname(BigDecimal suriname) {
        this.suriname = suriname;
    }

    public BigDecimal getSwaziland() {
        return this.swaziland;
    }

    public void setSwaziland(BigDecimal swaziland) {
        this.swaziland = swaziland;
    }

    public BigDecimal getSweden() {
        return this.sweden;
    }

    public void setSweden(BigDecimal sweden) {
        this.sweden = sweden;
    }

    public BigDecimal getSwitzerland() {
        return this.switzerland;
    }

    public void setSwitzerland(BigDecimal switzerland) {
        this.switzerland = switzerland;
    }

    public BigDecimal getSyria() {
        return this.syria;
    }

    public void setSyria(BigDecimal syria) {
        this.syria = syria;
    }

    public BigDecimal getTaiwan() {
        return this.taiwan;
    }

    public void setTaiwan(BigDecimal taiwan) {
        this.taiwan = taiwan;
    }

    public BigDecimal getTajikistan() {
        return this.tajikistan;
    }

    public void setTajikistan(BigDecimal tajikistan) {
        this.tajikistan = tajikistan;
    }

    public BigDecimal getThailand() {
        return this.thailand;
    }

    public void setThailand(BigDecimal thailand) {
        this.thailand = thailand;
    }

    public BigDecimal getTogo() {
        return this.togo;
    }

    public void setTogo(BigDecimal togo) {
        this.togo = togo;
    }

    public BigDecimal getTonga() {
        return this.tonga;
    }

    public void setTonga(BigDecimal tonga) {
        this.tonga = tonga;
    }

    public BigDecimal getTrinidad_and_tobago() {
        return this.trinidad_and_tobago;
    }

    public void setTrinidad_and_tobago(BigDecimal trinidad_and_tobago) {
        this.trinidad_and_tobago = trinidad_and_tobago;
    }

    public BigDecimal getTunisia() {
        return this.tunisia;
    }

    public void setTunisia(BigDecimal tunisia) {
        this.tunisia = tunisia;
    }

    public BigDecimal getTurkey() {
        return this.turkey;
    }

    public void setTurkey(BigDecimal turkey) {
        this.turkey = turkey;
    }

    public BigDecimal getTurkmenistan() {
        return this.turkmenistan;
    }

    public void setTurkmenistan(BigDecimal turkmenistan) {
        this.turkmenistan = turkmenistan;
    }

    public BigDecimal getTimor_leste() {
        return this.timor_leste;
    }

    public void setTimor_leste(BigDecimal timor_leste) {
        this.timor_leste = timor_leste;
    }

    public BigDecimal getTuvalu() {
        return this.tuvalu;
    }

    public void setTuvalu(BigDecimal tuvalu) {
        this.tuvalu = tuvalu;
    }

    public BigDecimal getTurks_and_caicos_islands() {
        return this.turks_and_caicos_islands;
    }

    public void setTurks_and_caicos_islands(BigDecimal turks_and_caicos_islands) {
        this.turks_and_caicos_islands = turks_and_caicos_islands;
    }

    public BigDecimal getUganda() {
        return this.uganda;
    }

    public void setUganda(BigDecimal uganda) {
        this.uganda = uganda;
    }

    public BigDecimal getUkraine() {
        return this.ukraine;
    }

    public void setUkraine(BigDecimal ukraine) {
        this.ukraine = ukraine;
    }

    public BigDecimal getUnited_arab_emirates() {
        return this.united_arab_emirates;
    }

    public void setUnited_arab_emirates(BigDecimal united_arab_emirates) {
        this.united_arab_emirates = united_arab_emirates;
    }

    public BigDecimal getUnited_kingdom() {
        return this.united_kingdom;
    }

    public void setUnited_kingdom(BigDecimal united_kingdom) {
        this.united_kingdom = united_kingdom;
    }

    public BigDecimal getTanzania() {
        return this.tanzania;
    }

    public void setTanzania(BigDecimal tanzania) {
        this.tanzania = tanzania;
    }

    public BigDecimal getUsa() {
        return this.usa;
    }

    public void setUsa(BigDecimal usa) {
        this.usa = usa;
    }

    public BigDecimal getUruguay() {
        return this.uruguay;
    }

    public void setUruguay(BigDecimal uruguay) {
        this.uruguay = uruguay;
    }

    public BigDecimal getUzbekistan() {
        return this.uzbekistan;
    }

    public void setUzbekistan(BigDecimal uzbekistan) {
        this.uzbekistan = uzbekistan;
    }

    public BigDecimal getVanuatu() {
        return this.vanuatu;
    }

    public void setVanuatu(BigDecimal vanuatu) {
        this.vanuatu = vanuatu;
    }

    public BigDecimal getVenezuela() {
        return this.venezuela;
    }

    public void setVenezuela(BigDecimal venezuela) {
        this.venezuela = venezuela;
    }

    public BigDecimal getViet_nam() {
        return this.viet_nam;
    }

    public void setViet_nam(BigDecimal viet_nam) {
        this.viet_nam = viet_nam;
    }

    public BigDecimal getWallis_and_futuna_islands() {
        return this.wallis_and_futuna_islands;
    }

    public void setWallis_and_futuna_islands(BigDecimal wallis_and_futuna_islands) {
        this.wallis_and_futuna_islands = wallis_and_futuna_islands;
    }

    public BigDecimal getYemen() {
        return this.yemen;
    }

    public void setYemen(BigDecimal yemen) {
        this.yemen = yemen;
    }

    public BigDecimal getZambia() {
        return this.zambia;
    }

    public void setZambia(BigDecimal zambia) {
        this.zambia = zambia;
    }

    public BigDecimal getZimbabwe() {
        return this.zimbabwe;
    }

    public void setZimbabwe(BigDecimal zimbabwe) {
        this.zimbabwe = zimbabwe;
    }

    public float getYear() {
        return this.year;
    }

    public void setYear(float year) {
        this.year = year;
    }

    public BigDecimal getAnguilla() {
        return this.anguilla;
    }

    public void setAnguilla(BigDecimal anguilla) {
        this.anguilla = anguilla;
    }
        

}