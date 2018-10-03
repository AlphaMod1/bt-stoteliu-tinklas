# bt-stoteliu-tinklas

## Projekto Integracija � karkas� 
lt.baltictalents.stoteliutinklas.interfeisai package'e rasite interfeisus, kuri� implementacijas tur�site sukurti grupinio projekto metu.

Suk�r� interfeiso implementacij�, atnaujinkite ir klas� `lt.baltictalents.stoteliutinklas.implementacija.Factory`

Pavyzd�iui.:

Turime interfeis� `SampleService`:

```java
public interface SampleService {
	public String getHello();
}
```

Kai sukursite interfeiso implementacij�, pavyzd�iui su pavadinimu `SampleServiceImpl`, tada `Factory` klas� atnaujinkite �tai taip:

```java
public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
```

`getSampleService` metodas jau yra sukurtas `Factory` klas�je, jums tik reiki� j� u�pildyti.
I� tikr�j�, galite d�ti kok� norite kod� � metod� `getSampleService`, svarbu tik kad jis gr��int� objekt�, kuris i�pildo norim� interfeis� (�iuo atveju - `SampleService`)

## Duomenys
`lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb` klas� turi stoteli� s�ra��, su kuriuo reiks dirbti. Importuokite �i� klas� � savo sukurtas klases ir naudokite duomenis.

## Testavimas per Postman
Dar neapra�yta..