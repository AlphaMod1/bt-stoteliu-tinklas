package lt.baltictalents.stoteliutinklas.data.hardcode;
import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
public class HardCodedDb {
	private List<Station> stoteles;
	
	private static List<Station> createDb() {
		List<Station> stoteles = new ArrayList<Station>(1260);
		stoteles.add(new Station("Vaikų ligoninė", "25.2807679", "54.7553245",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Juozo Tumo-Vaižganto st.", "25.2692819", "54.6895504",
				new String[]{"Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Pamėnkalnio st.", "25.2695466", "54.6873433",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Bernardinų sodas", "25.2905741", "54.6847849",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Juozo Tumo-Vaižganto st.", "25.2679281", "54.6883214",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a.", "Troleibusas 4: Antakalnis - Žemieji Paneriai"}));
		stoteles.add(new Station("Pamėnkalnio st.", "25.2666552", "54.6878581",
				new String[]{"Autobusas 11: Užupis => Žvėrynas", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Jokūbo Jasinskio st.", "25.2633102", "54.6881235",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Naujininkai", "25.2731076", "54.6608541",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 4: Stotis => Kirtimai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 1: Stotis => Oro uostas", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Seminarija", "25.2779375", "54.7356963",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Pušynas", "25.2787230", "54.7331758",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Naujakiemio st.", "25.2814121", "54.7238768",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Jono Kazlausko st.", "25.2849277", "54.7214941",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Baltupiai", "25.2799571", "54.7269755",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 1G: Santariškės - Stotis", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Tauragnų st.", "25.2861835", "54.7114784",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Pasakų parkas", "25.2059904", "54.6848889",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Atminties st.", "25.2064329", "54.6867573",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Dvarčionys", "25.3705169", "54.7296849",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Gelvonėlio st.", "25.2567279", "54.7144908",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Čiobiškio st.", "25.2329114", "54.7194770",
				new String[]{"Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Simono Stanevičiaus st.", "25.2542742", "54.7263762",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Simono Stanevičiaus st.", "25.2537038", "54.7252305",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Sietyno st.", "25.2211734", "54.6985865",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 2G: Santariškės - Stotis", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Teodoro Narbuto st.", "25.2300983", "54.6999103",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Teodoro Narbuto st.", "25.2299487", "54.7002560",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Žvėryno žiedas", "25.2462276", "54.6984367",
				new String[]{"Autobusas 11: Žvėrynas => Užupis", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 32: Žvėrynas - Pašilaičiai", "Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Sėlių st.", "25.2497403", "54.6974908",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis"}));
		stoteles.add(new Station("Latvių st.", "25.2508420", "54.6941870",
				new String[]{"Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Latvių st.", "25.2507398", "54.6938543",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis"}));
		stoteles.add(new Station("Liubarto tiltas", "25.2569280", "54.6889111",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Simono Konarskio st.", "25.2593827", "54.6797574",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Vaidilutės st.", "25.2945380", "54.7360598",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Jovaro st.", "25.2539702", "54.7229399",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Stadionas", "25.2971215", "54.6675255",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 2: Stotis => Oro uostas", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Pelesos st.", "25.2911080", "54.6711706",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 2: Stotis => Oro uostas", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Jokūbo Jasinskio st.", "25.2635562", "54.6883045",
				new String[]{"Autobusas 11: Užupis => Žvėrynas", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Liubarto tiltas", "25.2557384", "54.6890982",
				new String[]{"Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Taraso Ševčenkos st.", "25.2671569", "54.6787878",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Taraso Ševčenkos st.", "25.2674054", "54.6770985",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Vingis", "25.2554993", "54.6775153",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Vingis", "25.2545707", "54.6772992",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Mikalojaus Konstantino Čiurlionio st.", "25.2647004", "54.6816599",
				new String[]{"Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Troleibusas 4: Antakalnis - Žemieji Paneriai"}));
		stoteles.add(new Station("Mikalojaus Konstantino Čiurlionio st.", "25.2652755", "54.6820148",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Mikalojaus Konstantino Čiurlionio st.", "25.2654907", "54.6808062",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Bendoriai", "25.1978034", "54.7950332",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Klevinė", "25.1931639", "54.7807140",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Bukiškių st.", "25.2060684", "54.7577039",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Bukiškių st.", "25.2057508", "54.7574464",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Naujamiestis", "25.2612629", "54.6704452",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Autobusas 2G: Stotis - Santariškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Naugarduko st.", "25.2596096", "54.6703847",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Smolensko st.", "25.2591531", "54.6671620",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Smolensko st.", "25.2601839", "54.6674886",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("„Lelija“", "25.2637084", "54.6681826",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("„Lelija“", "25.2670889", "54.6697130",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Prūsų st.", "25.2727961", "54.6651502",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 4: Stotis => Kirtimai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 1: Stotis => Oro uostas", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Dailės akademija", "25.2928609", "54.6840067",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Karaliaus Mindaugo tiltas", "25.2890312", "54.6881633",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Karaliaus Mindaugo tiltas", "25.2871987", "54.6886832",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Žirmūnų seniūnija", "25.3000260", "54.7223704",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Šaltinėlio st.", "25.2982785", "54.7253330",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Žalgirio st.", "25.2829025", "54.7039503",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Linkmenų st.", "25.2697933", "54.7048792",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Statybininkų st.", "25.2556550", "54.6727580",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Žemaitės st.", "25.2519752", "54.6748465",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Burbiškės", "25.2525889", "54.6668120",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Burbiškės", "25.2530345", "54.6667130",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Statybininkų st.", "25.2563526", "54.6719282",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Stotis (A)", "25.2849899", "54.6707185",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Stotis (E)", "25.2833507", "54.6714268",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Stotis (F)", "25.2832818", "54.6711206",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 15: Stotis - Titnago g.", "Autobusas 2G: Santariškės - Stotis", "Autobusas 2G: Stotis - Santariškės", "Troleibusas 15: Titnago g. - Stotis", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Stotis (I)", "25.2832158", "54.6707631",
				new String[]{"Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Stotis (J)", "25.2830501", "54.6706242",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 2: Stotis => Oro uostas", "Autobusas 4: Stotis => Kirtimai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 1: Stotis => Oro uostas", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Stotis (L)", "25.2835994", "54.6702569",
				new String[]{"Autobusas 1G: Stotis - Santariškės", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės"}));
		stoteles.add(new Station("Stotis", "25.2830027", "54.6713991",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 1: Oro uostas => Stotis", "Autobusas 4: Kirtimai => Stotis", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 1G: Santariškės - Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Vingio parkas", "25.2419093", "54.6739598",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Vinco Pietario st.", "25.2452768", "54.6764027",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Leono Sapiegos st.", "25.3088158", "54.6969539",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Leono Sapiegos st.", "25.3080975", "54.6963332",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Šilo tiltas", "25.3109713", "54.7053909",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Šilo tiltas", "25.3102446", "54.7051712",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 4G: Saulėtekis - Pilaitė", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Šilo tiltas", "25.3102464", "54.7045133",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Petro Vileišio st.", "25.3092111", "54.7016499",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Petro Vileišio st.", "25.3100622", "54.7028837",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Europos aikštė", "25.2772144", "54.6953613",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės"}));
		stoteles.add(new Station("Gerosios Vilties st.", "25.2416007", "54.6704122",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Vaduvos st.", "25.2067554", "54.6444255",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 28 Žemieji Paneriai - Grigiškės", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Vaduvos st.", "25.2070117", "54.6448644",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 28 Žemieji Paneriai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Ateities st.", "25.2659556", "54.7359836",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Ateities st.", "25.2666428", "54.7362406",
				new String[]{"Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Ateities st.", "25.2651619", "54.7368906",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Vilkpėdės žiedas", "25.2449524", "54.6657607",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Vilkpėdės st.", "25.2369663", "54.6650470",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Vilkpėdės st.", "25.2353670", "54.6632057",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Eigulių st.", "25.2357722", "54.6693761",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Eigulių st.", "25.2354492", "54.6690066",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai"}));
		stoteles.add(new Station("Savanorių prospektas", "25.2484524", "54.6739115",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Savanorių prospektas", "25.2469904", "54.6734502",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 2G: Stotis - Santariškės", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Arkikatedra", "25.2867501", "54.6866685",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Arkikatedra", "25.2863618", "54.6866179",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Tuskulėnų rimties parkas", "25.3003246", "54.6976018",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 4G: Saulėtekis - Pilaitė", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Šiaurės miestelis", "25.3045857", "54.7108600",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Tuskulėnai", "25.2967262", "54.6977044",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Tverečiaus st.", "25.3164671", "54.7161996",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Gerosios Vilties st.", "25.2419237", "54.6708383",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 2G: Stotis - Santariškės", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Saulėtekis", "25.3248188", "54.7262564",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Saulėtekis", "25.3275130", "54.7261822",
				new String[]{"Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Saulėtekis", "25.3268027", "54.7272488",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Vilniaus universitetas", "25.3312294", "54.7249454",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Vilniaus universitetas", "25.3320523", "54.7245047",
				new String[]{"Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Gedimino technikos universitetas", "25.3342735", "54.7242052",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Gedimino technikos universitetas", "25.3356435", "54.7238399",
				new String[]{"Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Senoji plytinė", "25.3397793", "54.7240896",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Senoji plytinė", "25.3408302", "54.7241715",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Ūmėdžių st.", "25.2042540", "54.6426312",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Licėjus", "25.2789713", "54.7130178",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 7: Lazdynai => Šiaurės miestelis"}));
		stoteles.add(new Station("Mikalojaus Katkaus st.", "25.2924901", "54.7008304",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Mikalojaus Katkaus st.", "25.2928603", "54.7000897",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Šv. Petro ir Povilo bažnyčia", "25.3034254", "54.6928321",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Šv. Petro ir Povilo bažnyčia", "25.3031203", "54.6930724",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Simono Konarskio st.", "25.2591935", "54.6794142",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Valakampių tiltas", "25.3074421", "54.7236790",
				new String[]{"Troleibusas 10: Saulėtekis - Naujininkai"}));
		stoteles.add(new Station("Lizdeikos st.", "25.3163315", "54.7271504",
				new String[]{"Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 5G: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Tuskulėnų rimties parkas", "25.3012607", "54.6982068",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Trakų st.", "25.2763634", "54.6800142",
				new String[]{"Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Sėlių st.", "25.2485219", "54.6984449",
				new String[]{"Autobusas 11: Užupis => Žvėrynas", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Algirdo st.", "25.2666149", "54.6814982",
				new String[]{"Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Algirdo st.", "25.2682284", "54.6820027",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Jeruzalė", "25.2769344", "54.7431391",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 1G: Santariškės - Stotis", "Autobusas 2G: Santariškės - Stotis", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Žaliųjų Ežerų st.", "25.2791375", "54.7485458",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Spaudos rūmai", "25.2237752", "54.7027279",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Spaudos rūmai", "25.2235051", "54.7036470",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Viršuliškės", "25.2261676", "54.7068117",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis"}));
		stoteles.add(new Station("J. Matulaičio bažnyčia", "25.2266386", "54.7118420",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Viršuliškės", "25.2267668", "54.7085044",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("J. Matulaičio bažnyčia", "25.2282099", "54.7123735",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Rygos st.", "25.2297228", "54.7164920",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Rygos st.", "25.2320190", "54.7157519",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Rugių st.", "25.2704108", "54.7381407",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Rugių st.", "25.2693353", "54.7380597",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Liepkalnis", "25.2989225", "54.6628148",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Perlojos", "25.2921570", "54.6646750",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Merkinės st.", "25.2862817", "54.6642053",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Liepkalnis", "25.3002075", "54.6629840",
				new String[]{"Autobusas 2: Oro uostas => Stotis", "Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("„Sparta“", "25.2694399", "54.6723576",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 3G: Oro uostas - Fabijoniškės"}));
		stoteles.add(new Station("Švitrigailos st.", "25.2679380", "54.6742642",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Vytenio st.", "25.2660219", "54.6734155",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("„Sparta“", "25.2695319", "54.6711857",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 4: Stotis => Kirtimai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 1: Stotis => Oro uostas", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Vytenio st.", "25.2621548", "54.6717917",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Baltupiai", "25.2784699", "54.7276309",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Baltupiai", "25.2802899", "54.7279328",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 1G: Stotis - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai"}));
		stoteles.add(new Station("„Žalgirio” stadionas", "25.2895796", "54.6946990",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Šeimyniškių st.", "25.2961556", "54.6957006",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("„Žalgirio” stadionas", "25.2899587", "54.6950519",
				new String[]{"Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Šeimyniškių st.", "25.2968007", "54.6954890",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Vilniaus rajono poliklinika", "25.2333109", "54.7228724",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Pašilaičių žiedas", "25.2338446", "54.7277827",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Parodų rūmai", "25.2219128", "54.6757160",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Parodų rūmai", "25.2225190", "54.6756900",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Lazdynai", "25.2133821", "54.6788566",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 2G: Santariškės - Stotis"}));
		stoteles.add(new Station("Lazdynai", "25.2133154", "54.6793019",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Tverečiaus st.", "25.3165533", "54.7175034",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Antakalnis", "25.3171585", "54.7195619",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Antakalnis", "25.3182013", "54.7210178",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Klinikų st.", "25.3149633", "54.7113675",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Klinikų st.", "25.3143618", "54.7105536",
				new String[]{"Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 4G: Saulėtekis - Pilaitė", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Lietuvos edukologijos universitetas", "25.2613814", "54.6987248",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Lietuvos edukologijos universitetas", "25.2613762", "54.6982547",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Prūsų st.", "25.2732105", "54.6648888",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 1: Oro uostas => Stotis", "Autobusas 4: Kirtimai => Stotis", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Kalnų parkas", "25.2945825", "54.6894541",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Kalnų parkas", "25.2952443", "54.6894561",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Vinco Kudirkos aikštė", "25.2798231", "54.6887064",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 1G: Santariškės - Stotis", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Vinco Kudirkos aikštė", "25.2798384", "54.6876571",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 1G: Stotis - Santariškės", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Jogailos st.", "25.2781431", "54.6851454",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 11: Žvėrynas => Užupis", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Centro poliklinika", "25.2770020", "54.6836784",
				new String[]{"Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 1G: Santariškės - Stotis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Troleibusas 2: Saulėtekis - Stotis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Trakų st.", "25.2784939", "54.6790292",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 1G: Stotis - Santariškės", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Rūdninkų st.", "25.2848286", "54.6746263",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 1G: Stotis - Santariškės", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Trakų st.", "25.2779354", "54.6794710",
				new String[]{"Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 1G: Santariškės - Stotis", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Antakalnio žiedas", "25.3188591", "54.7223332",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 39 Antakalnis - Balžio g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Vilkpėdės žiedas", "25.2456964", "54.6656925",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Operos ir baleto teatras", "25.2757890", "54.6912621",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Troleibusas 4: Antakalnis - Žemieji Paneriai"}));
		stoteles.add(new Station("Felikso Vaitkaus st.", "25.2740358", "54.6435354",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Felikso Vaitkaus st.", "25.2737197", "54.6436074",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Operos ir baleto teatras", "25.2773245", "54.6908165",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Nacionalinė dailės galerija", "25.2706801", "54.6978369",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 88 Oro uostas - Centras - Europos a.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Lietuvos sąjūdžio kelias", "25.2664907", "54.6985432",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 88 Oro uostas - Centras - Europos a.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Gedimino prospektas", "25.2626884", "54.6893241",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Vingio parkas", "25.2394658", "54.6728764",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Gedimino prospektas", "25.2620622", "54.6890907",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Nacionalinė dailės galerija", "25.2725062", "54.6969161",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės"}));
		stoteles.add(new Station("Studentų st.", "25.2643262", "54.6972780",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Studentų st.", "25.2632906", "54.6972873",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Lietuvos sąjūdžio kelias", "25.2663339", "54.6982310",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės"}));
		stoteles.add(new Station("Lvovo st.", "25.2827841", "54.6945189",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Lvovo st.", "25.2839271", "54.6945844",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Giraitės st.", "25.2382460", "54.6687607",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Baldai", "25.2184208", "54.6507916",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Sausupio st.", "25.2121800", "54.6472423",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Šaltinio st.", "25.1830415", "54.6016704",
				new String[]{"Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 8: Vaidotai => Žemieji Paneriai"}));
		stoteles.add(new Station("Šaltinio st.", "25.1821342", "54.6014179",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Posūkis", "25.3930894", "54.6264009",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Sodžiaus st.", "25.3890449", "54.6139167",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Posūkis", "25.3922892", "54.6272631",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Stankutiškės", "25.3902299", "54.6208487",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Stankutiškės", "25.3899194", "54.6203827",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Skaidiškės", "25.3825448", "54.6056753",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 12 Stotis - Rudamina - Skaidiškės"}));
		stoteles.add(new Station("Skaidiškės", "25.3835629", "54.6064002",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Sodžiaus st.", "25.3887187", "54.6136254",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Skaidiškių žiedas", "25.3858005", "54.6092960",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 12 Stotis - Rudamina - Skaidiškės"}));
		stoteles.add(new Station("Skaistės st.", "25.3932608", "54.6056901",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Vilijos st.", "25.1717293", "54.6355635",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Kazbėjų st.", "25.1495986", "54.6158296",
				new String[]{"Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Prekybos st.", "25.1567317", "54.6213467",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai"}));
		stoteles.add(new Station("Elektrinės st.", "25.1624116", "54.6677600",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Vandenvala", "25.1738547", "54.6654287",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Vilijos st.", "25.1730231", "54.6359268",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Galvės st.", "25.1507728", "54.6327460",
				new String[]{"Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Elektrinės st.", "25.1620134", "54.6675359",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Gariūnai", "25.1605958", "54.6599976",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Kauno plentas", "25.1509221", "54.6542182",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Kazbėjų st.", "25.1490683", "54.6165096",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Gariūnų st.", "25.1545015", "54.6529620",
				new String[]{"Autobusas 28 Žemieji Paneriai - Grigiškės"}));
		stoteles.add(new Station("Jočionys", "25.1619000", "54.6647700",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Gariūnai", "25.1608603", "54.6591232",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Kauno plentas", "25.1509175", "54.6552839",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Slėnis", "25.1543281", "54.6123145",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Gariūnų st.", "25.1487477", "54.6559087",
				new String[]{"Autobusas 28 Žemieji Paneriai - Grigiškės"}));
		stoteles.add(new Station("Aukštieji Paneriai", "25.1740001", "54.6314059",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Juodšilių st.", "25.1629841", "54.6160653",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Vokės st.", "25.1449028", "54.6197664",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Prekybos st.", "25.1574167", "54.6205582",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Slėnis", "25.1541779", "54.6122073",
				new String[]{"Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Vytauto Andriaus Graičiūno st.", "25.1599848", "54.6082478",
				new String[]{"Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Kulokiškės", "25.1439620", "54.6453622",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Juodšilių st.", "25.1623854", "54.6167261",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai"}));
		stoteles.add(new Station("Galvės st.", "25.1509605", "54.6324663",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Vandenvala", "25.1731841", "54.6655036",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Aukštieji Paneriai", "25.1737254", "54.6312292",
				new String[]{"Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Kulokiškės", "25.1422255", "54.6456966",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Vokės st.", "25.1452099", "54.6192352",
				new String[]{"Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Jočionys", "25.1617100", "54.6641500",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Gariūnai", "25.1588750", "54.6589058",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Lentvario st.", "25.1772559", "54.6383853",
				new String[]{"Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Miško parkas", "25.3030120", "54.6366880",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Dariaus ir Girėno st.", "25.2730410", "54.6470583",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Ąžuolijai", "25.2426100", "54.6216500",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Katiliškės", "25.3131263", "54.6061674",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Metalo st.", "25.2659309", "54.6464749",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Kinologijos centras", "25.3211451", "54.6487647",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Sodai", "25.3466086", "54.6423937",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Verslo st.", "25.2593757", "54.6393061",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Vilniaus st.", "25.2694619", "54.6057221",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Mechanikų st.", "25.2514682", "54.6097054",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 19 Stotis - Salininkai"}));
		stoteles.add(new Station("Salininkai", "25.2515118", "54.6057244",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai"}));
		stoteles.add(new Station("Elektros st.", "25.2563714", "54.6337430",
				new String[]{"Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Kelininkų st.", "25.3025908", "54.6491209",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Minsko plentas", "25.3386943", "54.6443116",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Dariaus ir Girėno st.", "25.2732391", "54.6475300",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Kirtimai => Stotis", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Geologų st.", "25.2668551", "54.6386795",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Užusienis", "25.2393400", "54.6330380",
				new String[]{"Autobusas 41 Stotis - Užusienis", "Autobusas 41 Stotis - Užusienis"}));
		stoteles.add(new Station("Lydos st.", "25.3056691", "54.6252664",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Meistrų st.", "25.2593882", "54.6308778",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Rodūnios kelias", "25.2777011", "54.6418496",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Ąžuolijai", "25.2437600", "54.6218400",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Žirnių st.", "25.3039000", "54.6539100",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Šalčininkų kryptis", "25.3026674", "54.6439912",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Verslo st.", "25.2587262", "54.6389840",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Ąžuolijai", "25.2445574", "54.6202224",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Katiliškės", "25.3130285", "54.6043486",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Lydos st.", "25.3054287", "54.6251904",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Kelmijos sodai", "25.2438910", "54.6082539",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Raisteliai", "25.2180123", "54.6113600",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Kelmijos sodai", "25.2439586", "54.6078806",
				new String[]{"Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Metalo st.", "25.2656285", "54.6455049",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Geologų st.", "25.2668047", "54.6398580",
				new String[]{"Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Mechanikų st.", "25.2517521", "54.6097181",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Tiekimo st.", "25.2732039", "54.6332053",
				new String[]{"Autobusas 4: Stotis => Kirtimai"}));
		stoteles.add(new Station("Salininkai", "25.2497900", "54.6059115",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Eišiškių plentas", "25.2719160", "54.6514532",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Žirnių st.", "25.3030842", "54.6548638",
				new String[]{"Autobusas 2: Oro uostas => Stotis", "Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Daržininkai", "25.3684320", "54.6371942",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Hidrogeologijos st.", "25.2632058", "54.6434200",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Raistelių miškas", "25.2300326", "54.6112830",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Panerių miškas", "25.2294425", "54.6170018",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Basiukai", "25.3109267", "54.6105599",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Dilgynė", "25.2537570", "54.6343115",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Dieveniškių st.", "25.2487713", "54.6340650",
				new String[]{"Autobusas 41 Stotis - Užusienis"}));
		stoteles.add(new Station("Šalčininkų kryptis", "25.3028874", "54.6448584",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Katilinė", "25.2659600", "54.6348400",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Raisteliai", "25.2175023", "54.6112100",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Eišiškių plentas", "25.2717396", "54.6512634",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Melioratorių st.", "25.2606440", "54.6051522",
				new String[]{"Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Žirnių st.", "25.3019256", "54.6546131",
				new String[]{"Autobusas 2: Stotis => Oro uostas"}));
		stoteles.add(new Station("Daržininkai", "25.3666849", "54.6380476",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Metalo st.", "25.2649814", "54.6458342",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Melioratorių st.", "25.2584010", "54.6053033",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Tiekimo st.", "25.2731087", "54.6320847",
				new String[]{"Autobusas 4: Kirtimai => Stotis"}));
		stoteles.add(new Station("Svirno st.", "25.3080166", "54.6186500",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės"}));
		stoteles.add(new Station("Dieveniškių st.", "25.2493100", "54.6338200",
				new String[]{"Autobusas 41 Stotis - Užusienis"}));
		stoteles.add(new Station("Salininkų žiedas", "25.2520146", "54.6142128",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Paštas", "25.2764749", "54.6357944",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Nemėžis", "25.3563057", "54.6404827",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Hidrogeologijos st.", "25.2626273", "54.6429961",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Panerių miškas", "25.2277825", "54.6164018",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Basiukai", "25.3105088", "54.6120513",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės"}));
		stoteles.add(new Station("Dilgynė", "25.2540601", "54.6348621",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Eišiškių sodai", "25.2494857", "54.6262339",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Kelininkų st.", "25.3030817", "54.6505475",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Miško parkas", "25.3033391", "54.6361009",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Pervaža", "25.2746875", "54.6092302",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Sakalaičių st.", "25.2752924", "54.6124824",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Salininkų sodai", "25.2845462", "54.6182066",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Eišiškių sodai", "25.2495205", "54.6274202",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Eišiškių plentas", "25.2677709", "54.6492715",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Kinologijos centras", "25.3205595", "54.6492587",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Salininkų sodai", "25.2834664", "54.6180387",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Nemėžis", "25.3568455", "54.6399399",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Kirtimai", "25.2745933", "54.6374372",
				new String[]{"Autobusas 4: Stotis => Kirtimai"}));
		stoteles.add(new Station("Pervaža", "25.2745001", "54.6095110",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Svirno st.", "25.3081900", "54.6172531",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Kirtimų geležinkelio stotis", "25.2722551", "54.6295705",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis"}));
		stoteles.add(new Station("Čigonų st.", "25.2646600", "54.6307500",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Žirnių st.", "25.3026381", "54.6530352",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Minsko plentas", "25.3374131", "54.6450075",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Eišiškių plentas", "25.2685181", "54.6496498",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Salininkų žiedas", "25.2517614", "54.6140503",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 19 Stotis - Salininkai"}));
		stoteles.add(new Station("Vilniaus st.", "25.2706886", "54.6061275",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Rodūnios kelias", "25.2779085", "54.6417120",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Sodai", "25.3456904", "54.6429981",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Kirtimai", "25.2745945", "54.6368200",
				new String[]{"Autobusas 4: Kirtimai => Stotis"}));
		stoteles.add(new Station("Raistelių miškas", "25.2309000", "54.6110900",
				new String[]{"Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Sakalaičių st.", "25.2750188", "54.6120227",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Karaimų kapinės", "25.2973800", "54.6551000",
				new String[]{"Autobusas 2: Oro uostas => Stotis"}));
		stoteles.add(new Station("Kalvarijos", "25.2754626", "54.7393140",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kalvarijos", "25.2767715", "54.7385583",
				new String[]{"Autobusas 1G: Santariškės - Stotis", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Kalvarijos", "25.2768246", "54.7399222",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 1G: Stotis - Santariškės", "Autobusas 2G: Stotis - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Jankiškių st.", "25.1946768", "54.6453911",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g."}));
		stoteles.add(new Station("Valkininkų st.", "25.2024046", "54.6440652",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Valkininkų st.", "25.2018592", "54.6437961",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Titnago st.", "25.1856006", "54.6500710",
				new String[]{"Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Valkininkų st.", "25.1996500", "54.6439500",
				new String[]{"Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Šaltupio st.", "25.1911132", "54.6467842",
				new String[]{"Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Jankiškių st.", "25.1951591", "54.6450987",
				new String[]{"Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Žemieji Paneriai", "25.2093127", "54.6462512",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 28 Žemieji Paneriai - Grigiškės", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 28 Žemieji Paneriai - Grigiškės", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Šaltupio st.", "25.1903456", "54.6473432",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g."}));
		stoteles.add(new Station("Baldai", "25.2161912", "54.6499122",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Titnago st.", "25.1854653", "54.6502996",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g."}));
		stoteles.add(new Station("Pramogų arena", "25.2866244", "54.7145927",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 1G: Santariškės - Stotis", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Pramogų arena", "25.2856462", "54.7151228",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Pramogų arena", "25.2879690", "54.7150139",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Tauragnų st.", "25.2867523", "54.7124550",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Zujūnai", "25.1814887", "54.7266962",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Zujūnai", "25.1820721", "54.7266265",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Sodų st.", "25.1879291", "54.7240980",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Sodų st.", "25.1871321", "54.7242426",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Rinktinės st.", "25.2880564", "54.6950626",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Rinktinės st.", "25.2883728", "54.6950928",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Giedraičių st.", "25.2854853", "54.7079969",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Giedraičių st.", "25.2850127", "54.7076594",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ugniagesių st.", "25.2107868", "54.6902322",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis"}));
		stoteles.add(new Station("Pavilionys", "25.2232817", "54.7421278",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Ąžuolo st.", "25.2169271", "54.6792612",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Ryto st.", "25.2136581", "54.6821789",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Ąžuolo st.", "25.2176337", "54.6799366",
				new String[]{"Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Architektų st.", "25.2144904", "54.6734312",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Pelesos st.", "25.2918015", "54.6713861",
				new String[]{"Autobusas 2: Oro uostas => Stotis", "Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Kareivių st.", "25.3015585", "54.7199551",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 5G: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Kareivių st.", "25.3033169", "54.7206987",
				new String[]{"Autobusas 5G: Pašilaičiai - Saulėtekis", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Kareivių st.", "25.3037579", "54.7192920",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Šaltinėlio st.", "25.2969337", "54.7265352",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 21: Žirmūnai - Saulėtekis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Žirmūnų seniūnija", "25.3006018", "54.7219375",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Minties st.", "25.3041249", "54.7036585",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 4G: Saulėtekis - Pilaitė", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Kareivių st.", "25.3039097", "54.7185642",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Minties st.", "25.3045793", "54.7041842",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Šiaurės miestelis", "25.3051060", "54.7118385",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Nemenčinės plentas", "25.3202000", "54.7228664",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 4G: Pilaitė - Saulėtekis", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 39 Antakalnis - Balžio g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Lizdeikos st.", "25.3154804", "54.7273345",
				new String[]{"Autobusas 5G: Pašilaičiai - Saulėtekis", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Valakampių tiltas", "25.3086027", "54.7240884",
				new String[]{"Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Lukiškės", "25.2707170", "54.6909173",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Laisvės prospektas", "25.2212730", "54.6975325",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Sietyno st.", "25.2211465", "54.6996656",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 32: Žvėrynas - Pašilaičiai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Šaulių sąjunga", "25.2260257", "54.7090978",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Čiobiškio st.", "25.2319849", "54.7189902",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Žemynos st.", "25.2339732", "54.7266648",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Rygos st.", "25.2301671", "54.7156841",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis"}));
		stoteles.add(new Station("Sietyno st.", "25.2234472", "54.7003677",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Rygos st.", "25.2315100", "54.7168788",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Žvėrynas", "25.2431819", "54.6995047",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Panorama", "25.2561587", "54.6988769",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Spaudos rūmai", "25.2254546", "54.7041878",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Žvėrynas", "25.2450243", "54.6993873",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Kražių st.", "25.2709788", "54.6918455",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai"}));
		stoteles.add(new Station("Kražių st.", "25.2712413", "54.6917555",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Žvejų st.", "25.2887538", "54.6900251",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Žvejų st.", "25.2890776", "54.6918053",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Šiaurės miestelis", "25.3039681", "54.7113946",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 7: Lazdynai => Šiaurės miestelis"}));
		stoteles.add(new Station("Verkių st.", "25.2953417", "54.7172200",
				new String[]{"Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Karoliniškių poliklinika", "25.2152241", "54.6934342",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis"}));
		stoteles.add(new Station("Atminties st.", "25.2071525", "54.6871938",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 9: Karoliniškės - Šiaurės miestelis"}));
		stoteles.add(new Station("Pakalniškių st.", "25.2248492", "54.6543680",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Riovonys", "25.2322188", "54.6589175",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Nemenčinės plentas", "25.3200972", "54.7239061",
				new String[]{"Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 19: Saulėtekis - Pašilaičiai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Povilo Lukšio st.", "25.3023903", "54.7107238",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Verkių st.", "25.2936716", "54.7169501",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 7: Šiaurės miestelis => Lazdynai"}));
		stoteles.add(new Station("Reformatų st.", "25.2774360", "54.6814813",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 20: Stotis - Žirmūnai", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Pakalniškių st.", "25.2238181", "54.6542146",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 15: Stotis - Titnago g.", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Gėlių st.", "25.2836247", "54.6741918",
				new String[]{"Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Pramogų arena", "25.2893813", "54.7155583",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 5G: Pašilaičiai - Saulėtekis"}));
		stoteles.add(new Station("Riovonys", "25.2335558", "54.6596036",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Reformatų st.", "25.2772849", "54.6811677",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Verkių st.", "25.2955489", "54.7184192",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai"}));
		stoteles.add(new Station("Bernardinų st.", "25.3120017", "54.6820167",
				new String[]{"Autobusas 11: Žvėrynas => Užupis", "Autobusas 11: Užupis => Žvėrynas"}));
		stoteles.add(new Station("Polocko st.", "25.3130032", "54.6833686",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Polocko st.", "25.3126545", "54.6827421",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Filaretų st.", "25.3091033", "54.6847485",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Filaretų st.", "25.3084962", "54.6853771",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Musninkų st.", "25.2437777", "54.7166792",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Musninkų st.", "25.2446764", "54.7165845",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Dūkštų st.", "25.2453924", "54.7147983",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 43 Centras - Šeškinė - Justiniškės"}));
		stoteles.add(new Station("Šeškinės poliklinika", "25.2474806", "54.7160782",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Šiltnamių st.", "25.2148729", "54.6709089",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai"}));
		stoteles.add(new Station("Šiltnamių st.", "25.2141651", "54.6711033",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai"}));
		stoteles.add(new Station("Ukmergės st.", "25.2496910", "54.7125180",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Ukmergės st.", "25.2493715", "54.7119288",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Igno Šeiniaus st.", "25.2442524", "54.7214899",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Igno Šeiniaus st.", "25.2436047", "54.7217777",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Viršuliškės", "25.2267813", "54.7064981",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis"}));
		stoteles.add(new Station("Tuskulėnai", "25.2970850", "54.6969696",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Islandijos st.", "25.2765092", "54.6849607",
				new String[]{"Autobusas 11: Užupis => Žvėrynas", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Islandijos st.", "25.2765504", "54.6847544",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Žaliasis tiltas", "25.2804958", "54.6923787",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 1G: Stotis - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st.", "Troleibusas 14: Gerosios Vilties st. - Saulėtekis"}));
		stoteles.add(new Station("Subačiaus st.", "25.3024073", "54.6772796",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Užupio st.", "25.2923144", "54.6800084",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Subačiaus st.", "25.3036138", "54.6770111",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("„Audėjas“", "25.3117574", "54.6787776",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Srovės st.", "25.3156359", "54.6819038",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Zarasų st.", "25.3105183", "54.6762033",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Zarasų st.", "25.3101320", "54.6766670",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Bernardinų kapinės", "25.3054543", "54.6814713",
				new String[]{"Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Dailės akademija", "25.2929915", "54.6821472",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Krivių st.", "25.3055884", "54.6872996",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Krivių st.", "25.3053757", "54.6880199",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Vasaros st.", "25.3050664", "54.6913085",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Kaukaro st.", "25.2158773", "54.7067082",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Lūžiai", "25.2177726", "54.7117022",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Lūžiai", "25.2165451", "54.7107784",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Justiniškės", "25.2221951", "54.7175060",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Justiniškės st.", "25.2219966", "54.7167438",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Justiniškės st.", "25.2208220", "54.7165718",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Licėjus", "25.2769849", "54.7131808",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Ateities st.", "25.2667120", "54.7370045",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 2G: Stotis - Santariškės", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Saltoniškės", "25.2618200", "54.7023255",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Linkmenų st.", "25.2723552", "54.7045355",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Panorama", "25.2571179", "54.6991626",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Troleibusas 9: Šiaurės miestelis - Karoliniškės", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Smalinės st.", "25.1871826", "54.7094326",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Šeškinės kalvos", "25.2570645", "54.7115418",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės"}));
		stoteles.add(new Station("Šeškinės kalvos", "25.2583401", "54.7111544",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 7: Lazdynai => Šiaurės miestelis"}));
		stoteles.add(new Station("Šeškinės kalvos", "25.2561609", "54.7108794",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 5G: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Vaikų kaimas", "25.2412350", "54.7087996",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Vaikų kaimas", "25.2403964", "54.7095054",
				new String[]{"Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Alberto Goštauto st.", "25.2675313", "54.6945274",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Kražių st.", "25.2698390", "54.6916234",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Lukiškės", "25.2725064", "54.6903727",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Saltoniškės", "25.2644308", "54.7023587",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis"}));
		stoteles.add(new Station("Saltoniškės", "25.2628387", "54.7012144",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Kęstučio st.", "25.2516613", "54.6911081",
				new String[]{"Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 7: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Žvėrynas", "25.2456843", "54.6987056",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis"}));
		stoteles.add(new Station("Vytauto st.", "25.2561452", "54.6916892",
				new String[]{"Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Vytauto st.", "25.2564578", "54.6911468",
				new String[]{"Autobusas 11: Užupis => Žvėrynas"}));
		stoteles.add(new Station("Kęstučio st.", "25.2518679", "54.6894566",
				new String[]{"Troleibusas 3: Karoliniškės - Šeimyniškių g.", "Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis"}));
		stoteles.add(new Station("Džocharo Dudajevo skv.", "25.2558060", "54.6957771",
				new String[]{"Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Džocharo Dudajevo skv.", "25.2560911", "54.6958930",
				new String[]{"Autobusas 11: Užupis => Žvėrynas"}));
		stoteles.add(new Station("Užupio st.", "25.2926854", "54.6799122",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Karaliaus Mindaugo tiltas", "25.2865318", "54.6887089",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Bernardinų sodas", "25.2910209", "54.6850165",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Vilnios st.", "25.2935646", "54.6802747",
				new String[]{"Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Misionierių st.", "25.2964438", "54.6766274",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Aušros vartai", "25.2894594", "54.6737009",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Gervėčių st.", "25.2972597", "54.6745995",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Aušros vartai", "25.2927867", "54.6747250",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Misionierių st.", "25.2971896", "54.6766032",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Vingriai", "25.2809064", "54.6766242",
				new String[]{"Troleibusas 1: Karoliniškės - Stotis", "Troleibusas 7: Pašilaičiai - Stotis", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 2: Saulėtekis - Stotis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Bazilijonų st.", "25.2865787", "54.6740903",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Gedvydžių st.", "25.2342103", "54.7341435",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Šnipiškės", "25.2688482", "54.6997458",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Žalgirio st.", "25.2822423", "54.7037675",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Trimitų st.", "25.2889131", "54.7029398",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Herkaus Manto st.", "25.2862156", "54.7004531",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Herkaus Manto st.", "25.2866077", "54.7011034",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Pramogų arena", "25.2869452", "54.7162571",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 1G: Stotis - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Įsruties st.", "25.1810929", "54.7104693",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Tolminkiemio st.", "25.1799889", "54.7071946",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Įsruties st.", "25.1830470", "54.7099013",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Karaliaučiaus st.", "25.1757923", "54.7072151",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Pajautos st.", "25.1739380", "54.7105587",
				new String[]{"Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Pajautos st.", "25.1760500", "54.7101764",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Pilaitė", "25.2033876", "54.7025540",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Verkių rūmai", "25.2959665", "54.7522910",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Verkių rūmai", "25.2964439", "54.7522136",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Papilėnų st.", "25.1873970", "54.7068611",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Papilėnų st.", "25.1865171", "54.7081616",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Karoliniškės", "25.2173677", "54.6928201",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Karoliniškės", "25.2161941", "54.6924085",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 2G: Santariškės - Stotis", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Laisvės prospektas", "25.2198409", "54.6963143",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Žemynos st.", "25.2334226", "54.7257110",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 19: Pašilaičiai - Saulėtekis", "Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Pijaus Žadeikos st.", "25.2476195", "54.7350278",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Fabijoniškių žiedas", "25.2403717", "54.7393758",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Fabijoniškių žiedas", "25.2414075", "54.7391376",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Pijaus Žadeikos st.", "25.2461764", "54.7348637",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Gedvydžių st.", "25.2382156", "54.7370347",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės"}));
		stoteles.add(new Station("Gedvydžių st.", "25.2372232", "54.7363441",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Sporto gimnazija", "25.2423677", "54.7316239",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Takas", "25.2359304", "54.7341544",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Troleibusų parkas", "25.2197231", "54.7035660",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Pumpėnų st.", "25.2218205", "54.7224423",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g."}));
		stoteles.add(new Station("Taikos st.", "25.2227317", "54.7218195",
				new String[]{"Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Televizijos bokštas", "25.2148310", "54.6908864",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Žėručio st.", "25.2068620", "54.6764306",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Lazdynų seniūnija", "25.2024869", "54.6747293",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Lazdynai", "25.2122107", "54.6777952",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Viršupis", "25.3449586", "54.6961455",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Juliaus Juzeliūno st.", "25.2356789", "54.7291740",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Kaimelio st.", "25.2444651", "54.7305954",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis"}));
		stoteles.add(new Station("Liudo Giros st.", "25.2542111", "54.7337636",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 2G: Stotis - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Mykolo Romerio universitetas", "25.2597233", "54.7353057",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 2G: Stotis - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Užupis", "25.3008276", "54.6812167",
				new String[]{"Autobusas 11: Žvėrynas => Užupis"}));
		stoteles.add(new Station("Jono Kairiūkščio st.", "25.2700626", "54.7569975",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis"}));
		stoteles.add(new Station("Akademijos st.", "25.2723948", "54.7526392",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Vasaros st.", "25.3046417", "54.6913256",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Didlaukio st.", "25.2693665", "54.7290330",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("„Audėjas“", "25.3105295", "54.6784432",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 11: Užupis => Žvėrynas", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Jono Kazlausko st.", "25.2838567", "54.7224336",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Jeruzalė", "25.2778732", "54.7439757",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 1G: Stotis - Santariškės", "Autobusas 2G: Stotis - Santariškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Molėtų plentas", "25.2780571", "54.7497925",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Naujakiemio st.", "25.2811887", "54.7246529",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Visoriai", "25.2647352", "54.7578124",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis"}));
		stoteles.add(new Station("Akademijos st.", "25.2702558", "54.7539205",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Molėtų plentas", "25.2775918", "54.7503125",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Architektų st.", "25.2133929", "54.6731773",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Ąžuolyno st.", "25.2353227", "54.7047766",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis"}));
		stoteles.add(new Station("Riešutų st.", "25.2156460", "54.6765396",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Ąžuolyno st.", "25.2340996", "54.7051269",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai"}));
		stoteles.add(new Station("Televizijos bokštas", "25.2125285", "54.6899593",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Siesikų st.", "25.2442986", "54.7098592",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Akacijų st.", "25.2028251", "54.6782459",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Šalnos st.", "25.2061415", "54.6730803",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Teodoro Narbuto st.", "25.2294218", "54.7002046",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 32: Žvėrynas - Pašilaičiai", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Pasakų parkas", "25.2056199", "54.6849737",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Šalnos st.", "25.2070528", "54.6728209",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Riešutų st.", "25.2161082", "54.6765304",
				new String[]{"Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Akacijų st.", "25.2017058", "54.6779050",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Siesikų st.", "25.2462926", "54.7098113",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Žiedas", "25.2127728", "54.7096238",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Taikos st.", "25.2224770", "54.7206614",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 5G: Pašilaičiai - Saulėtekis"}));
		stoteles.add(new Station("Atžalyno st.", "25.2140567", "54.7182283",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Mykolo Biržiškos gimnazija", "25.2184204", "54.7212892",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Taikos st.", "25.2215329", "54.7212996",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Mykolo Biržiškos gimnazija", "25.2171550", "54.7215974",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Žiedas", "25.2133790", "54.7094378",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Šiaurinė st.", "25.2151946", "54.7156049",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Atžalyno st.", "25.2143017", "54.7192176",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Šiaurinė st.", "25.2147485", "54.7149816",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Žolyno st.", "25.3383795", "54.7078410",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Antano Tumėno st.", "25.2614542", "54.6922154",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Klinikų st.", "25.3156425", "54.7116303",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Nepriklausomybės aikštė", "25.2652200", "54.6895210",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Bistryčios st.", "25.3295390", "54.7084156",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Bistryčios st.", "25.3297757", "54.7083624",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Klinikų st.", "25.3167077", "54.7113129",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Ąžuolų st.", "25.1934427", "54.7217165",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Skalvių st.", "25.2195473", "54.7345209",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Liudo Giros st.", "25.2520718", "54.7333437",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 10: Markučiai => Fabijoniškės"}));
		stoteles.add(new Station("Antano Jonyno st.", "25.2490162", "54.7316223",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Tvenkinių st.", "25.2007450", "54.7110339",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Naujosios Gineitiškės", "25.2013727", "54.7359703",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Medeinos st.", "25.2181146", "54.7288036",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 5G: Pašilaičiai - Saulėtekis"}));
		stoteles.add(new Station("Naujosios Gineitiškės", "25.2023812", "54.7358093",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Antežeriai", "25.1862531", "54.7335948",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Sūduvių st.", "25.2191876", "54.7264192",
				new String[]{"Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Ąžuolų st.", "25.1945491", "54.7206281",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Tvenkinių st.", "25.2006592", "54.7106435",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Senosios Gineitiškės", "25.1892437", "54.7359177",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Skalvių st.", "25.2201079", "54.7347501",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 32: Žvėrynas - Pašilaičiai", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Antano Jonyno st.", "25.2473456", "54.7313798",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 10: Markučiai => Fabijoniškės"}));
		stoteles.add(new Station("Buivydiškės", "25.1969551", "54.7173570",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Santariškės", "25.2803027", "54.7528454",
				new String[]{"Autobusas 1G: Stotis - Santariškės", "Autobusas 2G: Stotis - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Senosios Gineitiškės", "25.1937854", "54.7356324",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Sūduvių st.", "25.2191021", "54.7256246",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g."}));
		stoteles.add(new Station("Antežeriai", "25.1853693", "54.7325007",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Žaliųjų Ežerų st.", "25.2797983", "54.7505839",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Medeinos st.", "25.2190739", "54.7297020",
				new String[]{"Autobusas 5G: Saulėtekis - Pašilaičiai", "Troleibusas 7: Stotis - Pašilaičiai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai"}));
		stoteles.add(new Station("Jurgio Baltrušaičio st.", "25.2374905", "54.7294333",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Santariškės", "25.2797763", "54.7520185",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 1G: Santariškės - Stotis", "Autobusas 2G: Santariškės - Stotis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Mykolo Romerio universitetas", "25.2579235", "54.7352292",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 2G: Santariškės - Stotis", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Buivydiškės", "25.1964079", "54.7169209",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Vaikų ligoninė", "25.2805059", "54.7554564",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 1G: Santariškės - Stotis", "Autobusas 2G: Santariškės - Stotis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Bijūnų st.", "25.2160856", "54.6672887",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Buivydiškių st.", "25.2370736", "54.7141069",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 5G: Saulėtekis - Pašilaičiai", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Bitėnų st.", "25.1723465", "54.7016886",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Tolminkiemio st.", "25.1812360", "54.7073802",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Vilniaus rajono poliklinika", "25.2339944", "54.7233248",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Karaliaučiaus st.", "25.1757287", "54.7073976",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Senoji Pilaitė", "25.1967084", "54.7041314",
				new String[]{"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Lazdynų seniūnija", "25.2041706", "54.6752199",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Ratilių st.", "25.2143552", "54.6652560",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Erfurto st.", "25.2011228", "54.6736257",
				new String[]{"Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Užutekio st.", "25.2068611", "54.6591498",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai"}));
		stoteles.add(new Station("Neužmirštuolių st.", "25.2024934", "54.6581832",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai"}));
		stoteles.add(new Station("Sietyno st.", "25.2208784", "54.6989386",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Ratilių st.", "25.2140387", "54.6645580",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Lazdynai", "25.2125762", "54.6776142",
				new String[]{"Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Piliakalnio st.", "25.2124777", "54.6994346",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Oslo st.", "25.1987716", "54.6700647",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Gelvonėlio st.", "25.2574476", "54.7149839",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės"}));
		stoteles.add(new Station("Neužmirštuolių st.", "25.2037900", "54.6584521",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai"}));
		stoteles.add(new Station("Musninkų st.", "25.2447410", "54.7168348",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Bitėnų st.", "25.1719616", "54.7017715",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Jonažolių st.", "25.2074522", "54.6699964",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Paberžės st.", "25.2536496", "54.7161861",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Oslo st.", "25.1976029", "54.6701796",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Jonažolių st.", "25.2083808", "54.6698118",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Žėručio st.", "25.2084672", "54.6766360",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Paberžės st.", "25.2549263", "54.7161738",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Bukčiai", "25.1955141", "54.6549924",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai"}));
		stoteles.add(new Station("Buivydiškių st.", "25.2378031", "54.7131525",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 73 Justiniškės - Centras - Vilkpėdė", "Autobusas 5G: Pašilaičiai - Saulėtekis", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Gilužio st.", "25.1744295", "54.7039477",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Piliakalnio st.", "25.2117613", "54.6999003",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Užutekio st.", "25.2073976", "54.6590722",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Gilužio st.", "25.1744310", "54.7045252",
				new String[]{"Autobusas 4G: Saulėtekis - Pilaitė", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Pakalnučių st.", "25.2131912", "54.6691402",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Apkasų st.", "25.2914312", "54.7039416",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai"}));
		stoteles.add(new Station("Žygio st.", "25.2894517", "54.7045956",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Minties st.", "25.2986356", "54.7050729",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai"}));
		stoteles.add(new Station("Oskaro Milašiaus st.", "25.3145465", "54.7279561",
				new String[]{"Troleibusas 10: Saulėtekis - Naujininkai"}));
		stoteles.add(new Station("Žirmūnai", "25.3054889", "54.7167139",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("Žirmūnai", "25.3050512", "54.7160028",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 21: Žirmūnai - Saulėtekis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 20: Žirmūnai - Stotis"}));
		stoteles.add(new Station("Stasio Lozoraičio st.", "25.2423274", "54.7240704",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Pamiškė", "25.2549381", "54.7303425",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Stasio Lozoraičio st.", "25.2425231", "54.7244194",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Gelvonų st.", "25.2576579", "54.7176003",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Takas", "25.2368523", "54.7329427",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Gedvydžių st.", "25.2341125", "54.7347016",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Juliaus Juzeliūno st.", "25.2367993", "54.7304093",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Gelvonų st.", "25.2576955", "54.7184431",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Fabijoniškės", "25.2374099", "54.7315103",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Jurgio Baltrušaičio st.", "25.2388939", "54.7292999",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Jurgio Baltrušaičio st.", "25.2395787", "54.7291539",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Pamiškė", "25.2543588", "54.7295062",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Šeškinė", "25.2514717", "54.7096455",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės"}));
		stoteles.add(new Station("Liudo Giros st.", "25.2531470", "54.7340184",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Deivių st.", "25.2290877", "54.7356504",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Pijaus Žadeikos st.", "25.2462692", "54.7355770",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Kriaučiūnai", "25.1491612", "54.7124744",
				new String[]{"Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Miškiniai", "25.2271069", "54.6712730",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Smalinės st.", "25.1879688", "54.7085113",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Miškiniai", "25.2264512", "54.6709254",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Karaliaučiaus st.", "25.1751303", "54.7079611",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Giraitės st.", "25.2377599", "54.6689090",
				new String[]{"Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai"}));
		stoteles.add(new Station("Padekaniškės", "25.1604064", "54.7106373",
				new String[]{"Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Pajautos st.", "25.1748166", "54.7097678",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Padekaniškės", "25.1612809", "54.7104944",
				new String[]{"Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Kriaučiūnai", "25.1501834", "54.7120592",
				new String[]{"Autobusas 63 Žvėrynas - Pilaitės pr. - Karveliškės"}));
		stoteles.add(new Station("Rotušė", "25.2863470", "54.6782509",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Vokiečių st.", "25.2827711", "54.6805951",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a."}));
		stoteles.add(new Station("Paukščių takas", "25.2091281", "54.6805189",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Paukščių takas", "25.2091044", "54.6808901",
				new String[]{"Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Paukščių takas", "25.2073450", "54.6797938",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Antaviliai", "25.3964131", "54.7982055",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Miškas", "25.4031692", "54.7830672",
				new String[]{"Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Nugalėtojų st.", "25.3485388", "54.7417409",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Rato st.", "25.3086063", "54.7308878",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Laurų st.", "25.3832423", "54.7894868",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Jono Biliūno st.", "25.3906867", "54.7937059",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Sporto gimnazija", "25.2447633", "54.7329738",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Pašilaičių žiedas", "25.2344915", "54.7287008",
				new String[]{"Troleibusas 16: Stotis - Pašilaičiai", "Troleibusas 19: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Šilas", "25.3834656", "54.7820377",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Ežerėlių st.", "25.3424158", "54.7378137",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Svajonių st.", "25.3148173", "54.7406266",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Žuvėdrų st.", "25.3241682", "54.7313803",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Juliaus Juzeliūno st.", "25.2350484", "54.7305269",
				new String[]{"Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai"}));
		stoteles.add(new Station("Karačiūnai", "25.3829962", "54.7730516",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Gabijos st.", "25.2266075", "54.7314344",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai"}));
		stoteles.add(new Station("Smėlynė", "25.3648060", "54.7543411",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Žuvėdrų st.", "25.3246213", "54.7313390",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Veržuvos st.", "25.3740442", "54.7622355",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Nugalėtojų st.", "25.3493112", "54.7417522",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Kiškių st.", "25.3365680", "54.7338118",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Mėlynių st.", "25.3156740", "54.7397139",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Jono Biliūno st.", "25.3915714", "54.7942482",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("1-asis paplūdimys", "25.2960563", "54.7330785",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Balžio st.", "25.4296480", "54.7929900",
				new String[]{"Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Smėlynė", "25.3657432", "54.7546666",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Šilas", "25.3837915", "54.7830900",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Miškas", "25.4046284", "54.7833395",
				new String[]{"Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Ežerėlių st.", "25.3444271", "54.7386017",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Kiškių st.", "25.3381628", "54.7345702",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Meškeriotojų st.", "25.3199043", "54.7459529",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Turniškės", "25.3275144", "54.7451206",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Pašilaičiai", "25.2304672", "54.7319672",
				new String[]{"Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai"}));
		stoteles.add(new Station("Balžio žiedas", "25.4365305", "54.7941900",
				new String[]{"Autobusas 39 Antakalnis - Balžio g.", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Pašilaičiai", "25.2316746", "54.7314012",
				new String[]{"Autobusas 46 Pašilaičiai - Laisvės pr. - Žaliasis tiltas"}));
		stoteles.add(new Station("Antavilių žiedas", "25.3991602", "54.7997991",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("Grybautojų st.", "25.3175596", "54.7332942",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Kaimelio žiedas", "25.2448170", "54.7315831",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Meškeriotojų st.", "25.3201168", "54.7461717",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Autobusų parkas", "25.2957950", "54.7208521",
				new String[]{"Autobusas 7: Šiaurės miestelis => Lazdynai"}));
		stoteles.add(new Station("Lizdeikos st.", "25.3137751", "54.7286230",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Turniškių miškas", "25.3585092", "54.7484418",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Antaviliai", "25.3978082", "54.7986360",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai"}));
		stoteles.add(new Station("pagal pageidavimą", "25.2961215", "54.7209242",
				new String[]{"Troleibusas 6: Žemieji Paneriai - Žirmūnai"}));
		stoteles.add(new Station("Veržuvos st.", "25.3725442", "54.7614521",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Grybautojų st.", "25.3182683", "54.7329579",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Karačiūnai", "25.3821747", "54.7723267",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Turniškių miškas", "25.3577222", "54.7481940",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Balžio st.", "25.4290365", "54.7930333",
				new String[]{"Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Lakštingalų st.", "25.3310924", "54.7299746",
				new String[]{"Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Ozo žiedas", "25.2777003", "54.7146477",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės"}));
		stoteles.add(new Station("Ozo žiedas", "25.2779391", "54.7155292",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Tuputiškės", "25.3437951", "54.6764870",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Dunojaus st.", "25.3067378", "54.6666052",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Dunojaus st.", "25.3071079", "54.6664345",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Žemoji st.", "25.3509124", "54.6761576",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Markučiai", "25.3220860", "54.6743734",
				new String[]{"Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Ribiškės", "25.3133372", "54.6668352",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Gervėčių st.", "25.2989486", "54.6733198",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Ribiškės", "25.3125131", "54.6668772",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Salomėjos Nėries g.", "25.2318102", "54.7381769",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Liudviko Zamenhofo st.", "25.2289009", "54.7410796",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Juodasis kelias", "25.3254006", "54.6663415",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Žemoji st.", "25.3506378", "54.6761866",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Liudviko Zamenhofo st.", "25.2275546", "54.7420049",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Rasų kapinės", "25.3011856", "54.6700239",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Balstogės st.", "25.3044954", "54.6713671",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Juodasis kelias", "25.3245637", "54.6665307",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Salomėjos Nėries st.", "25.2323711", "54.7372820",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Tuputiškės", "25.3422959", "54.6765733",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Žemasis Pavilnys", "25.3593265", "54.6792601",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Ramybės st.", "25.2990666", "54.6720216",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Markučiai", "25.3226731", "54.6742872",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Paplaujos st.", "25.3187225", "54.6749255",
				new String[]{"Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Rasų kapinės", "25.3010749", "54.6704693",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Balstogės st.", "25.3050104", "54.6722264",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Paplaujos st.", "25.3194896", "54.6746402",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Žiedų st.", "25.3554886", "54.6776453",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Zarasų st.", "25.3092811", "54.6766160",
				new String[]{"Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Žiedų st.", "25.3546477", "54.6773612",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė"}));
		stoteles.add(new Station("Pramonės st.", "25.4186528", "54.6945151",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Pūčkoriai", "25.3665460", "54.6914407",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Lelijų st.", "25.4002083", "54.6894614",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Rugiagėlių st.", "25.4202660", "54.6961068",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Belmontas", "25.3204925", "54.6840639",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Girininkija", "25.3636278", "54.6943861",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Užtvankos st.", "25.3810588", "54.6965122",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Širšių st.", "25.3892595", "54.6955846",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Rudens st.", "25.3235523", "54.6860384",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Linksmoji st.", "25.4358491", "54.6950289",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Gandrų st.", "25.4143484", "54.6952089",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Paparčių st.", "25.3940772", "54.7016227",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Ievų st.", "25.4068489", "54.6942823",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Naujoji Vilnia", "25.4396040", "54.6951456",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Šilo st.", "25.3494013", "54.7000964",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Pūčkoriai", "25.3673080", "54.6911120",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Alberto Kojelavičiaus st.", "25.3966552", "54.6946326",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Alberto Kojelavičiaus st.", "25.3963375", "54.6950303",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Neries st.", "25.4293483", "54.6957362",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Širšių st.", "25.3874672", "54.6957037",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Rugiagėlių st.", "25.4218063", "54.6962599",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Dūmų st.", "25.4005322", "54.6932020",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Rudens st.", "25.3250093", "54.6863648",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Tremtinių st.", "25.4114640", "54.6931102",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Jankos Kupalos st.", "25.4013950", "54.6944500",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Pūčkorių atodanga", "25.3595132", "54.6919430",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Naujosios Vilnios žiedas", "25.4299677", "54.6859869",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Lyglaukiai", "25.3539235", "54.7027963",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Užkiemio st.", "25.4328309", "54.6990741",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Parko st.", "25.4244458", "54.6856271",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Lyglaukiai", "25.3538162", "54.7023748",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Genių st.", "25.4133237", "54.6880020",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Neries st.", "25.4290113", "54.6956384",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Uosių st.", "25.4019453", "54.6993875",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Respublikinė psichiatrijos ligoninė", "25.4193111", "54.6856800",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Uosių st.", "25.4014791", "54.6994361",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Tremtinių st.", "25.4096810", "54.6928890",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Kalno st.", "25.3927981", "54.7047409",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Respublikinė psichiatrijos ligoninė", "25.4186662", "54.6859394",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Linksmoji st.", "25.4360622", "54.6951901",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Šaudykla", "25.3306473", "54.6889943",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Viadukas", "25.3491492", "54.6939737",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Pūčkorių atodanga", "25.3600595", "54.6916090",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Šaudykla", "25.3317443", "54.6889214",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Mildos st.", "25.3438170", "54.6914593",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Pramonės st.", "25.4181389", "54.6943600",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Lelijų st.", "25.4011400", "54.6897368",
				new String[]{"Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Alberto Kojelavičiaus st.", "25.3962488", "54.6951456",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Užtvankos st.", "25.3810724", "54.6967306",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Bičių st.", "25.4296413", "54.6976796",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Alberto Kojelavičiaus st.", "25.3984699", "54.6963197",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Rokantiškės", "25.3639886", "54.7041131",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Mildos st.", "25.3420874", "54.6930628",
				new String[]{"Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g."}));
		stoteles.add(new Station("Girininkija", "25.3648562", "54.6945845",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Ievų st.", "25.4085024", "54.6943249",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Gandrų st.", "25.4146245", "54.6951700",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Uosių st.", "25.4011197", "54.6990167",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Paparčių st.", "25.3944862", "54.7016335",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Stepono Batoro st.", "25.3775791", "54.6931130",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Bičių st.", "25.4283538", "54.6973500",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Viadukas", "25.3488595", "54.6929847",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Parko st.", "25.4261772", "54.6854815",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Jankos Kupalos st.", "25.4017036", "54.6942881",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Stepono Batoro st.", "25.3791577", "54.6930932",
				new String[]{"Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Belmontas", "25.3193552", "54.6838685",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Rytų st.", "25.4337369", "54.6904323",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Mildos st.", "25.3434575", "54.6917352",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("Užkiemio st.", "25.4328160", "54.6988904",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Dūmų st.", "25.4013525", "54.6931941",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Genių st.", "25.4122621", "54.6883453",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Naujosios Vilnios žiedas", "25.4281301", "54.6855944",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 6G: Parko g. - Žaliasis tiltas", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Tremtinių st.", "25.4104967", "54.6926716",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Rytų st.", "25.4327629", "54.6895529",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Šiaurės st.", "25.4167872", "54.7092697",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Dvarčionių kryžkelė", "25.3708537", "54.7334585",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Purienų st.", "25.4123952", "54.7258171",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Grigaičiai", "25.4112607", "54.6813318",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Galgiai", "25.4113001", "54.7203097",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Plytinės st.", "25.3478594", "54.7279396",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Lubinų st.", "25.4121430", "54.7296128",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Dvarčionių kryžkelė", "25.3696377", "54.7334703",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Grigaičiai", "25.4130743", "54.6809500",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Baniškės", "25.3871193", "54.7345567",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Kairėnai", "25.4008634", "54.7362738",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Aukštagiris", "25.3566937", "54.7305877",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Pupojų st.", "25.4131361", "54.7018429",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Palydovo st.", "25.4099781", "54.7011015",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Paliuliškės", "25.4103287", "54.7336117",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Grigaičiai", "25.4123731", "54.6825973",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Kairėnai", "25.4004679", "54.7362678",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Plytinės st.", "25.3465761", "54.7275965",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Vakario st.", "25.4126247", "54.7145187",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g."}));
		stoteles.add(new Station("Aukštagiris", "25.3556683", "54.7305125",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Arimų st.", "25.4313733", "54.7024623",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Karklėnai", "25.4145722", "54.6758463",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Jaunimo st.", "25.4122398", "54.6697743",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Karklėnai", "25.4143447", "54.6756148",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Jaunimo st.", "25.4121209", "54.6700739",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Grigaičių žiedas", "25.4155242", "54.6642725",
				new String[]{"Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g."}));
		stoteles.add(new Station("Gurių sodai", "25.3597009", "54.6598436",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pavilnio sodai", "25.3465255", "54.6649749",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Grūdų st.", "25.3594057", "54.6679286",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Dzūkų st.", "25.2758978", "54.6658934",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Liepkalnis", "25.2999754", "54.6628872",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 2: Stotis => Oro uostas", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Garsioji st.", "25.3554038", "54.6669172",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Gamtininkų st.", "25.3684340", "54.6750137",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Guriai", "25.3422503", "54.6624123",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Grūdų st.", "25.3599529", "54.6686762",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Guriai", "25.3401635", "54.6628156",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Gurių sodai", "25.3588263", "54.6600510",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Liepkalnis", "25.2996354", "54.6627815",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Rudaminos st.", "25.2802671", "54.6642884",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Garsioji st.", "25.3534834", "54.6668955",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Alėja", "25.3842838", "54.6771414",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Ašmenėlės st.", "25.3554521", "54.6603582",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Perlojos st.", "25.2936546", "54.6642357",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Guriai", "25.3419499", "54.6633586",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Alėja", "25.3828980", "54.6772521",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Salininkai", "25.2506314", "54.6062449",
				new String[]{"Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Pavilnys", "25.3617982", "54.6717101",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Pavilnio sodai", "25.3455226", "54.6649068",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Rudaminos st.", "25.2796154", "54.6646462",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Merkinės st.", "25.2871202", "54.6641653",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pranciškaus Baltraus Šivickio st.", "25.3496156", "54.6613356",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Ašmenėlės st.", "25.3556077", "54.6602217",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Gamtininkų st.", "25.3675703", "54.6749516",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Dzūkų st.", "25.2762572", "54.6653660",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pranciškaus Baltraus Šivickio st.", "25.3498943", "54.6612115",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Strielčiukai", "25.3987004", "54.6778297",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Šumsko kryptis", "25.3644799", "54.6588750",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pavilnys", "25.3611760", "54.6711983",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Strielčiukai", "25.3969087", "54.6778979",
				new String[]{"Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia"}));
		stoteles.add(new Station("Lazdynų ligoninė", "25.2064714", "54.6690565",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Erfurto st.", "25.2006034", "54.6735906",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Petro Baublio st.", "25.2865037", "54.7515167",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Petro Baublio st.", "25.2884296", "54.7519191",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Popieriaus st.", "25.3326163", "54.7699921",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Ežerėliai", "25.3101447", "54.7626450",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Popieriaus st.", "25.3320855", "54.7698153",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Kurklių st.", "25.3273316", "54.7702654",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Ežerėliai", "25.3066586", "54.7613185",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Kurklių st.", "25.3264647", "54.7700045",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ožkiniai", "25.3617022", "54.7672502",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Naujoji st.", "25.3460005", "54.7634993",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Ožkinių žiedas", "25.3665608", "54.7683979",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Naujieji Verkiai", "25.3322215", "54.7598164",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Staviškės", "25.3528388", "54.7639782",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Vaikų darželis", "25.3357280", "54.7626011",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Staviškės", "25.3515916", "54.7634498",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Kremplių st.", "25.3358135", "54.7669834",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Kremplių st.", "25.3356480", "54.7672867",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Ožkiniai", "25.3600553", "54.7670553",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Naujoji st.", "25.3463438", "54.7633290",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Vaikų darželis", "25.3357972", "54.7628782",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Austėjos st.", "25.3451958", "54.7782474",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Verkių Riešė", "25.3382918", "54.7774492",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Balsiai", "25.3476769", "54.7860046",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ragučio st.", "25.3427872", "54.7808276",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Balsiai", "25.3478717", "54.7859712",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Naujaneriai", "25.3483989", "54.8017517",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ragučio st.", "25.3423205", "54.7806915",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Krakiškės", "25.3499916", "54.7952448",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ragės st.", "25.3512523", "54.7849761",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Kryžiokai", "25.3512174", "54.7922232",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Verkių Riešė", "25.3368595", "54.7769851",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Paežerys", "25.3352505", "54.8000783",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Kryžiokai", "25.3512094", "54.7916093",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Balsių mokykla", "25.3597688", "54.7805866",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Austėjos st.", "25.3463438", "54.7781422",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Ragės st.", "25.3519496", "54.7846698",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Paežerys", "25.3361300", "54.8003472",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Diemedis", "25.3295586", "54.8029817",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Pagubės sodai", "25.3267047", "54.8062343",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Pagubės sodai", "25.3272519", "54.8064724",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Krakiškės", "25.3499863", "54.7959839",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Diemedis", "25.3296390", "54.8032909",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Pagubės sodai", "25.3273967", "54.8059313",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Gulbinų st.", "25.3189531", "54.8058664",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Ąžuolynas", "25.3238283", "54.8110021",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Pagubė", "25.3131369", "54.8079446",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Gulbinų st.", "25.3198061", "54.8055418",
				new String[]{"Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Ąžuolynas", "25.3237601", "54.8112586",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Lazdynų ligoninė", "25.2125649", "54.6713405",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai"}));
		stoteles.add(new Station("Lazdynų ligoninė", "25.2090941", "54.6702877",
				new String[]{"Autobusas 29 Savanorių pr. - Lazdynai - Grigiškės", "Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai"}));
		stoteles.add(new Station("Tomo Žebrausko st.", "25.1996438", "54.7479880",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Laidagaliai", "25.1908784", "54.7466504",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Laidagaliai", "25.1900308", "54.7468362",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("1–osios Bukiškės", "25.1985924", "54.7629708",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Pagrandos st.", "25.1825342", "54.7464982",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Kelmiškių st.", "25.1786421", "54.7490592",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Pagrandos st.", "25.1826793", "54.7466373",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Raudonbalės st.", "25.1809437", "54.7493919",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Tarandė", "25.2072291", "54.7493131",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Tomo Žebrausko st.", "25.2002768", "54.7483038",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Tarandė", "25.2081196", "54.7493812",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Geležinio Vilko st.", "25.2723580", "54.7576498",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Mokyklos st.", "25.2637366", "54.7463294",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Ateities st.", "25.2658484", "54.7374934",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Prašiškės", "25.2718907", "54.7685609",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Mokyklos st.", "25.2633624", "54.7453515",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Skersinės st.", "25.2719227", "54.7652611",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Chemijos institutas", "25.2618021", "54.7551228",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės"}));
		stoteles.add(new Station("Skersinės st.", "25.2715190", "54.7644819",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Vanaginė", "25.2719601", "54.7738450",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Chemijos institutas", "25.2639042", "54.7538270",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Maumedžių st.", "25.2643758", "54.7411105",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Prašiškės", "25.2714554", "54.7682347",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Vanaginė", "25.2729448", "54.7754262",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Vanaginės žiedas", "25.2728727", "54.7813374",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Akademijos st.", "25.2683781", "54.7535545",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Akademijos st.", "25.2706273", "54.7526579",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Geležinio Vilko st.", "25.2716665", "54.7568297",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Maumedžių st.", "25.2643355", "54.7407095",
				new String[]{"Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Bajorų sodai", "25.2566569", "54.7576346",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės"}));
		stoteles.add(new Station("Erfurto st.", "25.2008039", "54.6745084",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Lazdynėliai", "25.1923824", "54.6626549",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Oslo st.", "25.1979239", "54.6695455",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Žaros st.", "25.1957696", "54.6665118",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Žaros st.", "25.1957620", "54.6667581",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Stadionas", "25.2963921", "54.6684776",
				new String[]{"Autobusas 2: Oro uostas => Stotis", "Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Panevėžio st.", "25.2848312", "54.6681216",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pelesos st.", "25.2890334", "54.6707831",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pelesos st.", "25.2897343", "54.6709601",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Panevėžio st.", "25.2837959", "54.6679540",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Seminarija", "25.2780619", "54.7369412",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai"}));
		stoteles.add(new Station("Pušynas", "25.2790435", "54.7341352",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai"}));
		stoteles.add(new Station("Ukmergės st.", "25.2488260", "54.7119961",
				new String[]{"Autobusas 43 Centras - Šeškinė - Justiniškės"}));
		stoteles.add(new Station("Bijūnų st.", "25.2158800", "54.6674025",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Vaivorykštės st.", "25.2068738", "54.6841711",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 7: Šiaurės miestelis => Lazdynai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 2G: Santariškės - Stotis", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 59 Žvėrynas - Lazdynai - Grigiškės", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Vaivorykštės st.", "25.2076533", "54.6850910",
				new String[]{"Autobusas 2G: Stotis - Santariškės", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Troleibusas 18: Titnago g. - Pašilaičiai", "Troleibusas 13: Žemieji Paneriai - Pašilaičiai", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Aguonų st.", "25.2783543", "54.6726822",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 1: Oro uostas => Stotis", "Autobusas 4: Kirtimai => Stotis", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Troleibusas 15: Titnago g. - Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Aguonų st.", "25.2773395", "54.6728607",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Troleibusas 15: Stotis - Titnago g.", "Autobusas 4: Stotis => Kirtimai", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 41 Stotis - Užusienis", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 16: Stotis - Pašilaičiai", "Autobusas 1: Stotis => Oro uostas", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Naujininkai", "25.2740842", "54.6623374",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 1: Oro uostas => Stotis", "Autobusas 4: Kirtimai => Stotis", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("„Sparta“", "25.2703372", "54.6719417",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 1: Oro uostas => Stotis", "Autobusas 4: Kirtimai => Stotis", "Autobusas 41 Stotis - Užusienis", "Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224 Vilniaus geležinkelio stotis - Pagiriai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai", "Autobusas 2G: Santariškės - Stotis", "Troleibusas 15: Titnago g. - Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Kučkuriškės", "25.3690899", "54.6955252",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Kučkuriškės", "25.3695481", "54.6958448",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g."}));
		stoteles.add(new Station("Ugniagesių st.", "25.2089725", "54.6895537",
				new String[]{"Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("Autobusų parkas", "25.2967911", "54.7222079",
				new String[]{"Autobusas 7: Lazdynai => Šiaurės miestelis", "Troleibusas 6: Žemieji Paneriai - Žirmūnai"}));
		stoteles.add(new Station("Karoliniškių poliklinika", "25.2140985", "54.6928391",
				new String[]{"Troleibusas 1: Stotis - Karoliniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Troleibusas 9: Šiaurės miestelis - Karoliniškės"}));
		stoteles.add(new Station("2-asis paplūdimys", "25.2946240", "54.7424020",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Kaimelio st.", "25.2462927", "54.7307105",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 2G: Stotis - Santariškės", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Kaimelio žiedas", "25.2444876", "54.7315499",
				new String[]{"Autobusas 10: Fabijoniškės => Markučiai"}));
		stoteles.add(new Station("Žaliasis tiltas", "25.2799592", "54.6923296",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 12: Žirmūnai - Žemieji Paneriai", "Troleibusas 14: Saulėtekis - Gerosios Vilties st.", "Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 1G: Santariškės - Stotis", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Troleibusas 3: Šeimyniškių g. - Karoliniškės", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Kalvarijų turgus", "25.2824762", "54.6994135",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 1G: Santariškės - Stotis"}));
		stoteles.add(new Station("Kalvarijų turgus", "25.2830229", "54.7002338",
				new String[]{"Autobusas 1G: Stotis - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 37 Rokantiškės - Olandų g. - Kalvarijų g.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Broniaus Laurinavičiaus skveras", "25.2840945", "54.7041406",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 1G: Stotis - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 10: Naujininkai - Saulėtekis"}));
		stoteles.add(new Station("Žalgirio st.", "25.2834605", "54.7031024",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai", "Autobusas 10: Fabijoniškės => Markučiai", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 1G: Santariškės - Stotis"}));
		stoteles.add(new Station("Žalgirio st.", "25.2842802", "54.7044023",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai"}));
		stoteles.add(new Station("„Sparta“", "25.2683782", "54.6718311",
				new String[]{"Troleibusas 15: Stotis - Titnago g.", "Autobusas 2G: Stotis - Santariškės", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Troleibusas 16: Stotis - Pašilaičiai"}));
		stoteles.add(new Station("Perkūno st.", "25.2277825", "54.7394165",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Perkūno st.", "25.2271791", "54.7394109",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė"}));
		stoteles.add(new Station("Pupinė", "25.2946824", "54.6213611",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Pupinė", "25.2957775", "54.6215314",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Sidaronių st.", "25.2035188", "54.7080144",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Sidaronių st.", "25.2029812", "54.7088479",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Beržų st.", "25.2490257", "54.8076162",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Beržų st.", "25.2483605", "54.8077585",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Baltoji Vokė", "25.1955230", "54.6023435",
				new String[]{"Autobusas 78 Stotis - Eišiškių pl. - Pagiriai", "Autobusas 9: Zuikių => Baltoji Vokė", "Autobusas 3: Vaidotai => Stotis", "Autobusas 3: Vaidotai => Stotis", "Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("Baltoji Vokė", "25.1945778", "54.6030203",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 78 Stotis - Eišiškių pl. - Pagiriai"}));
		stoteles.add(new Station("Kaukaro st.", "25.2157134", "54.7055429",
				new String[]{"Troleibusas 7: Pašilaičiai - Stotis", "Troleibusas 13: Pašilaičiai - Žemieji Paneriai", "Troleibusas 18: Pašilaičiai - Titnago g.", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Bendorėliai", "25.1948435", "54.7892363",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Avinėlių st.", "25.2734795", "54.6007224",
				new String[]{"Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Aukštoji Veržuva", "25.4280264", "54.7499974",
				new String[]{"Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Žemoji Veržuva", "25.4014954", "54.7500309",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Žemoji Veržuva", "25.4012470", "54.7500278",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Vaguva", "25.4168036", "54.7472479",
				new String[]{"Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Vaguva", "25.4171593", "54.7471376",
				new String[]{"Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Liudo Giros st.", "25.2535527", "54.7331687",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Naujamiestis", "25.2626184", "54.6705058",
				new String[]{"Troleibusas 16: Pašilaičiai - Stotis", "Autobusas 54 Stotis - Lazdynai - Pilaitė", "Autobusas 2G: Santariškės - Stotis", "Troleibusas 15: Titnago g. - Stotis"}));
		stoteles.add(new Station("Tyzenhauzų st.", "25.2921764", "54.6559284",
				new String[]{"Autobusas 2: Oro uostas => Stotis"}));
		stoteles.add(new Station("Oro uostas", "25.2795043", "54.6432959",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 2: Stotis => Oro uostas", "Autobusas 1: Oro uostas => Stotis", "Autobusas 2: Oro uostas => Stotis", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 3G: Fabijoniškės - Oro uostas", "Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 1: Stotis => Oro uostas"}));
		stoteles.add(new Station("Karaimų kapinės", "25.2970138", "54.6554545",
				new String[]{"Autobusas 2: Stotis => Oro uostas"}));
		stoteles.add(new Station("Tyzenhauzų st.", "25.2905463", "54.6563237",
				new String[]{"Autobusas 2: Stotis => Oro uostas"}));
		stoteles.add(new Station("Vikingų st.", "25.2819507", "54.6511993",
				new String[]{"Autobusas 2: Stotis => Oro uostas", "Autobusas 1: Stotis => Oro uostas"}));
		stoteles.add(new Station("Vikingų st.", "25.2825695", "54.6518420",
				new String[]{"Autobusas 1: Oro uostas => Stotis", "Autobusas 2: Oro uostas => Stotis"}));
		stoteles.add(new Station("Katilinė", "25.2661831", "54.6348945",
				new String[]{"Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Čigonų st.", "25.2649549", "54.6308832",
				new String[]{"Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Meistrų st.", "25.2593322", "54.6307588",
				new String[]{"Autobusas 3: Vaidotai => Stotis"}));
		stoteles.add(new Station("Elektros st.", "25.2566516", "54.6339863",
				new String[]{"Autobusas 3: Stotis => Vaidotai"}));
		stoteles.add(new Station("Krantinės st.", "25.1911351", "54.6041260",
				new String[]{"Autobusas 3: Stotis => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 3: Stotis => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Rodūnios sodų st.", "25.2777354", "54.6324765",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Rodūnios kelias => Stotis", "Autobusas 4: Stotis => Rodūnios kelias"}));
		stoteles.add(new Station("Paštas", "25.2770395", "54.6359904",
				new String[]{"Autobusas 4: Stotis => Kirtimai", "Autobusas 4: Kirtimai => Stotis", "Autobusas 4: Rodūnios kelias => Stotis"}));
		stoteles.add(new Station("Povilo Lukšio st.", "25.3011997", "54.7107395",
				new String[]{"Troleibusas 9: Karoliniškės - Šiaurės miestelis", "Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Vilijos st.", "25.1725442", "54.6347941",
				new String[]{"Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 8: Vaidotai => Žemieji Paneriai", "Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 51 Žemieji Paneriai - Trakų Vokė", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai", "Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("Chemijos st.", "25.1509699", "54.6262828",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Chemijos st.", "25.1471236", "54.6269474",
				new String[]{"Autobusas 8: Vaidotai => Žemieji Paneriai"}));
		stoteles.add(new Station("Zuikių st.", "25.1984683", "54.6324324",
				new String[]{"Autobusas 9: Zuikių => Baltoji Vokė", "Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("Vasarotojų st.", "25.1858916", "54.6250149",
				new String[]{"Autobusas 9: Zuikių => Baltoji Vokė"}));
		stoteles.add(new Station("Kadugių st.", "25.1799222", "54.6274605",
				new String[]{"Autobusas 9: Zuikių => Baltoji Vokė"}));
		stoteles.add(new Station("Agrastų st.", "25.1769503", "54.6294851",
				new String[]{"Autobusas 9: Zuikių => Baltoji Vokė", "Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("Kadugių st.", "25.1816477", "54.6266794",
				new String[]{"Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("Vasarotojų st.", "25.1850359", "54.6252794",
				new String[]{"Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("Didlaukio st.", "25.2714811", "54.7292013",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g. - Baltupiai - Olandų g. - Stotis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 26 Ozo g. - Didlaukio g. - Baltupio g. - Santariškės", "Autobusas 10: Markučiai => Fabijoniškės", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Stotis", "25.2846933", "54.6711736",
				new String[]{"Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Stotis (D)", "25.2839215", "54.6711006",
				new String[]{"Autobusas 13 Žemasis Pavilnys - Markučiai - Stotis - Vilkpėdė", "Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 54 Stotis - Lazdynai - Pilaitė"}));
		stoteles.add(new Station("Bruknių st.", "25.3034262", "54.7435512",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Stotis (B)", "25.2844684", "54.6711531",
				new String[]{"Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės"}));
		stoteles.add(new Station("Keramikų st.", "25.3745785", "54.7295234",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Dvarčionys", "25.3703179", "54.7298767",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Keramikų st.", "25.3747608", "54.7293803",
				new String[]{"Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Keramikų st.", "25.3749109", "54.7295768",
				new String[]{"Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Stotis (C)", "25.2841803", "54.6711255",
				new String[]{"Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai"}));
		stoteles.add(new Station("Salininkai", "25.2502960", "54.6060967",
				new String[]{"Autobusas 42 Stotis - Eišiškių pl. - Salininkai", "Autobusas 19 Stotis - Salininkai"}));
		stoteles.add(new Station("Ryto st.", "25.2130509", "54.6827181",
				new String[]{"Autobusas 23 Stotis - Švitrigailos g. - Lazdynai", "Autobusas 7: Lazdynai => Šiaurės miestelis", "Autobusas 21 Lazdynėliai - Lazdynai - Centras", "Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g.", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Pavilionys", "25.2238079", "54.7421168",
				new String[]{"Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Šeškinės poliklinika", "25.2470973", "54.7154809",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis", "Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Fabijoniškės - Oro uostas"}));
		stoteles.add(new Station("Šeškinė", "25.2521677", "54.7097664",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 5: Šiaurės miestelis => Pašilaičiai", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 43 Centras - Šeškinė - Justiniškės", "Autobusas 46 Žaliasis tiltas - Laisvės pr. - Pašilaičiai", "Autobusas 52 Centras – Konstitucijos pr. – Ukmergės g. – Tarandė", "Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Vilniaus Pergalė", "25.1520213", "54.6141317",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g.", "Autobusas 25 Žemieji Paneriai - V. A. Graičiūno g."}));
		stoteles.add(new Station("Stotis (H)", "25.2833527", "54.6708864",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Naujininkai", "25.2742388", "54.6627860",
				new String[]{"Troleibusas 17: Žirmūnai - Naujininkai", "Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Stotis (P)", "25.2852517", "54.6712493",
				new String[]{"Autobusas 34 Visoriai - Jeruzalės g - Baltupiai - Olandų g. - Stotis", "Autobusas 2: Oro uostas => Stotis", "Autobusas 12 Stotis - Rudamina - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 16 Stotis - Nemėžis - Skaidiškės", "Autobusas 19 Stotis - Salininkai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 82 Stotis - Salininkai - Juodšiliai", "Autobusas 31 Stotis - Pavilnys - Naujoji Vilnia", "Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 221 Vilniaus geležinkelio stotis - Marijampolis - Kalveliai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai", "Autobusas 227 Vilniaus geležinkelio stotis - Valčiūnai"}));
		stoteles.add(new Station("Margirio st.", "25.1870516", "54.6125643",
				new String[]{"Autobusas 9: Zuikių => Baltoji Vokė"}));
		stoteles.add(new Station("Ungurių st.", "25.2085067", "54.6535378",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g.", "Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Margirio st.", "25.1868921", "54.6129158",
				new String[]{"Autobusas 9: Baltoji Vokė => Zuikių"}));
		stoteles.add(new Station("„Sparta“", "25.2693415", "54.6726491",
				new String[]{"Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
		stoteles.add(new Station("Mažoji Riešė", "25.2023689", "54.8025595",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Mažoji Riešė", "25.2016125", "54.8025719",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Bendorėliai", "25.1956526", "54.7905452",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Durpynas", "25.1959102", "54.7703169",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Bendoriai", "25.1972526", "54.7944359",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Klevinė", "25.1927129", "54.7793742",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Durpynas", "25.1958082", "54.7708399",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Naujosios Vilnios žiedas", "25.4289334", "54.6854427",
				new String[]{"Autobusas 6G: Žaliasis tiltas - Parko g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Šaltinio st.", "25.1828918", "54.6013601",
				new String[]{"Autobusas 222 Vilniaus geležinkelio stotis - Vaidotai", "Autobusas 224A Vilniaus geležinkelio stotis - Vaidotai - Pagiriai"}));
		stoteles.add(new Station("Muzikų st.", "25.2809979", "54.7583009",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Muzikų st.", "25.2815874", "54.7592873",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Santariškių žiedas", "25.2822064", "54.7626238",
				new String[]{"Autobusas 1G: Stotis - Santariškės", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Santariškių žiedas", "25.2820413", "54.7636645",
				new String[]{"Autobusas 55 Santariškės - Laisvės pr. - Lazdynai", "Autobusas 1G: Santariškės - Stotis"}));
		stoteles.add(new Station("Vaikų ligoninė", "25.2808918", "54.7561511",
				new String[]{"Autobusas 1G: Stotis - Santariškės", "Autobusas 55 Santariškės - Laisvės pr. - Lazdynai"}));
		stoteles.add(new Station("Ateities st.", "25.2663967", "54.7357672",
				new String[]{"Autobusas 49 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Bukčiai", "Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Giedraičių st.", "25.2849218", "54.7074319",
				new String[]{"Troleibusas 6: Žirmūnai - Žemieji Paneriai", "Troleibusas 10: Saulėtekis - Naujininkai"}));
		stoteles.add(new Station("Kaimelio žiedas", "25.2443216", "54.7314145",
				new String[]{"Autobusas 10: Markučiai => Fabijoniškės"}));
		stoteles.add(new Station("Antakalnio žiedas", "25.3187832", "54.7220603",
				new String[]{"Autobusas 50 Antakalnis - Minties g. - Didlaukio g. - Bajorai", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g.", "Autobusas 18 Antakalnis - Dvarčionys - Parko g.", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Antakalnio žiedas", "25.3187109", "54.7230329",
				new String[]{"Troleibusas 10: Saulėtekis - Naujininkai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Troleibusas 4: Antakalnis - Žemieji Paneriai", "Autobusas 14 Antakalnis - Antakalnis - Gerosios Vilties st."}));
		stoteles.add(new Station("Arimų st.", "25.4317249", "54.7024460",
				new String[]{"Autobusas 27 Kalvarijų g. – Olandų g. – Arimų g.", "Autobusas 14 Grigaičiai - Parko - Arimų g.", "Autobusas 74 Stotis - Subačiaus g. - Parko g."}));
		stoteles.add(new Station("pagal pageidavimą", "25.3210397", "54.7105286",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Žolyno st.", "25.3380812", "54.7077907",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės"}));
		stoteles.add(new Station("Gvazdikų st.", "25.3986073", "54.7430411",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Gvazdikų st.", "25.3980564", "54.7436053",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 38 Antakalnis - Dvarčionys - Šilėnų g."}));
		stoteles.add(new Station("Senoji plytinė", "25.3406396", "54.7248554",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės"}));
		stoteles.add(new Station("Vinciūniškės", "25.3949970", "54.7591006",
				new String[]{"Autobusas 114 Saulėtekis - Vinciūniškės", "Autobusas 114 Saulėtekis - Vinciūniškės"}));
		stoteles.add(new Station("Lazdynai", "25.2136037", "54.6780166",
				new String[]{"Autobusas 68 Lazdynai - Mūrinė Vokė - Lentvaris - Grigiškės"}));
		stoteles.add(new Station("Lazdynėliai", "25.1926725", "54.6634830",
				new String[]{"Autobusas 21 Lazdynėliai - Lazdynai - Centras"}));
		stoteles.add(new Station("Fabijoniškių žiedas", "25.2407354", "54.7400544",
				new String[]{"Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 24 Fabijoniškės - Ukmergės g. - Žemieji Paneriai", "Autobusas 3G: Oro uostas - Fabijoniškės", "Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Mykolo Lietuvio st.", "25.2256410", "54.7435762",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Mykolo Lietuvio st.", "25.2295840", "54.7437125",
				new String[]{"Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Ukmergės st.", "25.2516701", "54.7132807",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras"}));
		stoteles.add(new Station("Papilėnų st.", "25.1878224", "54.7074974",
				new String[]{"Autobusas 4G: Pilaitė - Saulėtekis"}));
		stoteles.add(new Station("Jono Galvydžio st.", "25.2923308", "54.7118272",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Ulonų st.", "25.2912201", "54.7088887",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Ulonų st.", "25.2910004", "54.7091978",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Šiaurės miestelis", "25.2994648", "54.7111755",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Šiaurės miestelis", "25.2978651", "54.7115427",
				new String[]{"Autobusas 33 Šiaurės miestelis – Rinktinės g. – Sukilėlių g. – Guriai"}));
		stoteles.add(new Station("Pavilnionių st.", "25.2149844", "54.7356431",
				new String[]{"Autobusas 32: Žvėrynas - Pašilaičiai"}));
		stoteles.add(new Station("Pavilnionių st.", "25.2144706", "54.7357869",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas"}));
		stoteles.add(new Station("Žalgirio st.", "25.2847325", "54.7040200",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė"}));
		stoteles.add(new Station("Žaliųjų Ežerų st.", "25.2816353", "54.7498300",
				new String[]{"Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 35 Žalgirio g. - Naujieji Verkiai - Ožkiniai", "Autobusas 36 Žalgirio g. - Balsiai - Naujaneriai - Pagubė", "Autobusas 66 Žalgirio g. - Balsiai - Naujaneriai", "Autobusas 76 Ateities g. - Sakališkės - Bireliai"}));
		stoteles.add(new Station("Žalčių st.", "25.3507286", "54.7780857",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Žalčių st.", "25.3502922", "54.7782340",
				new String[]{"Autobusas 65 Ožkiniai - Pagubė - Balsiai - N. Verkiai - Ožkiniai"}));
		stoteles.add(new Station("Antakalnio žiedas", "25.3191341", "54.7228073",
				new String[]{"Autobusas 5G: Saulėtekis - Pašilaičiai"}));
		stoteles.add(new Station("Bijūnų st.", "25.2167235", "54.6674912",
				new String[]{"Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Musninkų st.", "25.2454255", "54.7171573",
				new String[]{"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"}));
		stoteles.add(new Station("Šiltnamių žiedas", "25.2214627", "54.6668069",
				new String[]{"Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Šiltnamių žiedas", "25.2215619", "54.6671076",
				new String[]{"Autobusas 69 Ateities g. - Didlaukio g. - Žalgirio g. - Lazdynai - Šiltnamių g."}));
		stoteles.add(new Station("Bajorai", "25.2370585", "54.7566980",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai", "Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Bajorų miškas", "25.2424106", "54.7562526",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Bajorų miškas", "25.2422021", "54.7564152",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Baltarusių st.", "25.3434165", "54.6336333",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Daubų st.", "25.2312614", "54.7573547",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Kalnėnai", "25.3312363", "54.6545231",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Kalnėnai", "25.3316464", "54.6545909",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Kuprioniškės", "25.3317056", "54.6411121",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės", "Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Mokslininkų st.", "25.2497394", "54.7543185",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Mokslininkų st.", "25.2495745", "54.7545576",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Nemėžis", "25.3556956", "54.6395712",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Pavilnio regioninis parkas", "25.3372455", "54.6599372",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Pavilnio regioninis parkas", "25.3374762", "54.6600611",
				new String[]{"Autobusas 58 Stotis - Dzūkų g. - Kalnėnai - Guriai"}));
		stoteles.add(new Station("Riaubonių st.", "25.2329572", "54.7553001",
				new String[]{"Autobusas 57 Fabijoniškės - Ateities g. - Bajorai"}));
		stoteles.add(new Station("Sodybų st.", "25.3270375", "54.6316911",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Vladislavo Sirokomlės st.", "25.3538937", "54.6345413",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Vyturių st.", "25.3276526", "54.6375461",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Šveicarų st.", "25.3265432", "54.6350986",
				new String[]{"Autobusas 61 Stotis - Nemėžis - Kuprioniškės"}));
		stoteles.add(new Station("Migracijos valdyba", "25.2556951", "54.6681603",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Migracijos valdyba", "25.2585820", "54.6700878",
				new String[]{"Autobusas 73 Justiniškės - Centras - Vilkpėdė"}));
		stoteles.add(new Station("Didžioji Riešė", "25.2567648", "54.8060493",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Didžioji Riešė", "25.2567849", "54.8069134",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Ežero st.", "25.2253247", "54.8089230",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Ežero st.", "25.2276100", "54.8091339",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kaštonų st.", "25.2620521", "54.7981149",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kaštonų st.", "25.2622445", "54.7983830",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kiparisų st.", "25.2719711", "54.7821945",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kiparisų st.", "25.2717367", "54.7832493",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kooperatyvo st.", "25.2600038", "54.8010726",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Kooperatyvo st.", "25.2598755", "54.8018651",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Lauko st.", "25.2659605", "54.7922058",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Lauko st.", "25.2657166", "54.7931505",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Riešės gimnazija", "25.2347359", "54.8085279",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Riešės gimnazija", "25.2333158", "54.8087648",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Samanų st.", "25.2693749", "54.7863983",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Samanų st.", "25.2691023", "54.7872050",
				new String[]{"Autobusas 87 Ozo g. - Didlaukio g. - Riešė - Bendoriai - Šeškinė"}));
		stoteles.add(new Station("Anapilio st.", "25.3581819", "54.7073388",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Anapilio st.", "25.3585591", "54.7076783",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Gudeliai", "25.1930373", "54.6756003",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Gudeliai", "25.1927963", "54.6758481",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Loretos Asanavičiūtės st.", "25.1995629", "54.6832270",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Loretos Asanavičiūtės st.", "25.2011269", "54.6831600",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Mileišiškių sodai", "25.3474965", "54.7130154",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Mileišiškių sodai", "25.3480733", "54.7130727",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Mileišiškės", "25.3424799", "54.7117864",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Mileišiškės", "25.3418133", "54.7118066",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Monikos Mironaitės st.", "25.1896699", "54.6808151",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Monikos Mironaitės st.", "25.1894862", "54.6808350",
				new String[]{"Autobusas 116 Žvėrynas - Gudelių šiltas - Lazdynai - Ungurių g."}));
		stoteles.add(new Station("Rokantiškių sodai", "25.3765328", "54.7060493",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Uosių sodai", "25.3853659", "54.7077239",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Viršupio sodai", "25.3529894", "54.7128164",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Viršupio sodai", "25.3528315", "54.7130951",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("pagal pageidavimą", "25.3565681", "54.7104045",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Žirmūnų žiedas", "25.2972453", "54.7266958",
				new String[]{"Troleibusas 20: Stotis - Žirmūnai", "Troleibusas 6: Žemieji Paneriai - Žirmūnai", "Troleibusas 12: Žemieji Paneriai - Žirmūnai", "Troleibusas 17: Naujininkai - Žirmūnai", "Troleibusas 21: Saulėtekis - Žirmūnai"}));
		stoteles.add(new Station("pagal pageidavimą", "25.1697217", "54.6683593",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("pagal pageidavimą", "25.1699549", "54.6685390",
				new String[]{"Autobusas 20 Žemieji Paneriai - Mūrinė Vokė - Lazdynai"}));
		stoteles.add(new Station("pagal pageidavimą", "25.3555974", "54.7045142",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g.", "Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Klonio", "25.3711827", "54.7058818",
				new String[]{"Autobusas 115 Antakalnis - Rokantiškės - Kalno g. - Parko g."}));
		stoteles.add(new Station("Europos aikštė", "25.2773763", "54.6956721",
				new String[]{"Autobusas 88 Oro uostas - Centras - Europos a.", "Autobusas 4G: Saulėtekis - Pilaitė"}));
		stoteles.add(new Station("Vikingų slėnis", "25.2804287", "54.6529666",
				new String[]{"Autobusas 2: Stotis => Oro uostas", "Autobusas 1: Oro uostas => Stotis", "Autobusas 2: Oro uostas => Stotis", "Autobusas 1: Stotis => Oro uostas"}));
		stoteles.add(new Station("pagal pageidavimą", "25.3090599", "54.6998508",
				new String[]{"Troleibusas 2: Stotis - Saulėtekis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis"}));
		stoteles.add(new Station("Lakštingalų st.", "25.3287486", "54.7287702",
				new String[]{"Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 15 Žolyno g. - Antakalnis - Turniškės", "Autobusas 17 Antakalnis - Nemenčinės pl. - Antaviliai", "Autobusas 39 Antakalnis - Balžio g."}));
		stoteles.add(new Station("Jovaro st.", "25.2540117", "54.7238015",
				new String[]{"Autobusas 56 Centras - Konstitucijos pr. - Šeškinė - Fabijoniškės", "Autobusas 40 Fabijoniškės - S. Stanevičiaus g. - Centras", "Autobusas 53 Stotis - Pylimo g. - Kalvarijų g. - Fabijoniškės", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"}));
		stoteles.add(new Station("Pilaitė", "25.2050371", "54.7010105",
				new String[]{"Autobusas 32 Pašilaičiai - Žvėrynas", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės", "Autobusas 30 Pilaitė–Konstitucijos pr.–Apkasų g.–Šiaurės miestelis", "Autobusas 54 Pilaitė–Lazdynai–Stotis", "Autobusas 63 Karveliškės–Pilaitės pr.–Žvėrynas"}));
		stoteles.add(new Station("Perkūnkiemis", "25.2192154", "54.7385015",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Pavilionys", "25.2221954", "54.7416726",
				new String[]{"Autobusas 5: Šiaurės miestelis => Pašilaičiai"}));
		stoteles.add(new Station("Perkūnkiemis", "25.2200898", "54.7391580",
				new String[]{"Autobusas 5: Pašilaičiai => Šiaurės miestelis"}));
		stoteles.add(new Station("Vilniaus Pergalė", "25.1518679", "54.6140357",
				new String[]{"Autobusas 8: Žemieji Paneriai => Vaidotai"}));
		stoteles.add(new Station("Aušros vartai", "25.2881911", "54.6741970",
				new String[]{"Autobusas 11: Užupis => Žvėrynas"}));
		return stoteles;
	}
	
	public HardCodedDb() {
		this.stoteles = createDb();
	}
	
	public List<Station> getStoteles() {
		return this.stoteles;
	}
}
