package org.infozesk.coffee;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Une classe d'outils pour CoffeeStock.<br>
 * Utilisez <code>CoffeeTools.getTools();</code> pour récupérer le singleton de
 * tools.
 */
public class CoffeeTools {

	/**
	 * Les propriétés trouvées dans le fichier
	 * src/main/resources/stock.properties
	 */
	private final Properties properties;

	/**
	 * Le singleton de tools
	 */
	private static CoffeeTools singleton;

	private CoffeeTools() {
		this.properties = getStockProperties();
	}

	/**
	 * Renvoie l'instance de tools
	 * 
	 * @return l'instance des tools
	 */
	public static CoffeeTools getTools() {
		if (singleton == null) {
			singleton = new CoffeeTools();
		}
		return singleton;
	}

	/**
	 * Renvoie les types de café sous la forme d'un tableau d'entier.
	 * 
	 * @return
	 */
	public String[] getCoffeeTypes() {
		return properties.getProperty("coffee.types").split(";");
	}

	/**
	 * Renvoie le stock initial du type de café donné en paramètre.
	 * 
	 * @param coffeeType
	 *            Le type de café recherché
	 * @return Le stock initial, ou -1 si le café n'est pas trouvé
	 */
	public int getCoffeeStock(String coffeeType) {
		String key = coffeeType + ".stock";
		if (properties.containsKey(key)) {
			return getIntProperty(key);
		}
		return -1;
	}

	/**
	 * Renvoie la valeur d'une propriété sous la forme d'un entier (int)
	 * 
	 * @param properties
	 *            Les propriétés
	 * @param key
	 *            La clé de la propriété
	 * @return la valeur d'une propriété sous la forme d'un entier (int)
	 */
	private int getIntProperty(String key) {
		return Integer.parseInt(properties.getProperty(key));
	}

	/**
	 * Renvoie les propriétés chargées depuis stock.properties
	 * 
	 * @return les propriétés
	 */
	private Properties getStockProperties() {
		URL stockFile = CoffeeStock.class.getResource("/stock.properties");
		Properties stockProperties = new Properties();
		try {
			stockProperties.load(new FileInputStream(stockFile.getFile()));
		} catch (IOException e) {
			throw new Error("Impossible de charger le fichier de stock depuis " + stockFile.getFile());
		}
		return stockProperties;

	}
}
