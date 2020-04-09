// Created on 20/07/2011, 14:22:11
package View;

import javax.swing.table.DefaultTableModel;

public final class Descricao extends javax.swing.JDialog {

    public Descricao() {
        super(Telaprincipal.getInstance(), true);
        initComponents();
        jtaDescricao.setEditable(false);
    }

    private void Distribuicao(String k, String l, String m, String n, String o, String p, String q) {
        DefaultTableModel dtme = new DefaultTableModel(
                new Object[]{"k", "L", "M", "N", "O", "P", "Q"}, 0);
        dtme.addRow(new Object[]{k, l, m, n, o, p, q});
        jtDistribuicao.setModel(dtme);
    }

    public void Hidrogenio() {
        setTitle("Hidrogênio");//1
        jtfMassa.setText("1,00794");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/gas.jpg")));
        jtaDescricao.setText("Nas CNTP é um gás incolor, inodoro e insípido, além de ser a substância mais leve que se conhece. Cavendish determinou a verdadeira\n"
                + "natureza do gás, que chamou 'ar inflamável' em 1766. Em 1781 provou que o hidrogênio ardia no ar e dava unicamente água. Seu nome deriva do\n"
                + "grego hydro + genes 'formador de água', e foi usado pela primeira vez por Lavousier.\n"
                + "O hidrogênio molecualr, H2 se encontra em certos gases vulcânicos e naturais misturados com outros gases. O espectroscópio mostra que está\n"
                + "presente no Sol, em muitas estrelas e nas nebulosas. Está presente nos gases intestinais de muitoas animais e se tem encontrado em certos\nmeteoritos.\n"
                + "Combinado, o hidrogênio forma 11,11%, em peso da água, e é o contituinte essencial de todos os ácidos, hidrocarbonetos e metérias vegetais\n"
                + "e animais. Também se encontra outros compostos orgânicos, tais como álcoois, éteres, açúcares, amido e celulose.\n"
                + "O átomo de hidrogênio consiste em um nucleo de massa 1, dotado de uma carga positiva unitária, isto é, um protón e um eletrón. Em\n"
                + "consequência, a molécula de hidrogênio, que corresponde a dois de seus átomos, contém dois prótons e dois eletróns.");
        Distribuicao("1", "--", "--", "--", "--", "--", "--");
    }

    public void Helio() {//2
        setTitle("Hélio");
        jtfMassa.setText("4,002");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/helio.jpg")));
        jtaDescricao.setText("O mais leve elemento conhecido depois do hidrogênio. Foi descoberto em 1868 na atmosfera do Sol por P. Janssen e J. Norman Lockyer, ainda\n"
                + "no mesmo ano mostrou que o hélio é um dos componentes da atmosfera.\n"
                + "O hélio ocorre em pequenas quantidades em minerais radioativos, meteoritos e certos gases naturais encontrados principalmente nos EUA e no \nCanadá."
                + "São poucas as fontes que permitem a extração industrial. Seja a partir do ar, seja a partir dos gases naturais, o hélio é obtido por meio\n"
                + "de destilação fracionada e processos de purificação químicos e temperaturas extremamente baixas.\n"
                + "É incolor, inodoro e insípido. Sua molécula é monoatômica e existe sob duas formas isotópicas. He³, com ponto de ebulição de -269,9 °C, e o He4,\n"
                + "com ponto de ebulição de -268,9 °C, também apresenta um isótopo radioativoo He6.\n"
                + "Durante a II Guerra Mundial, o hélio foi intensamente usado para enchimento de balões e dirigíveis, em substituição ao hidrogênio, altamente\n"
                + "explosivo. Ainda hoje é utilizado em balões-sonda. Na indústria é usado como atmosfera inerte em certos processos metalúrgicos e para preencher\n"
                + "os espaços entre sistemas óticos múltiplos, pois seu índice de refração é muito baixo. Em medicina é adicionado ao oxigênio a fim de facilitar\n"
                + "a respiração em casos de asma e doenças cardíacas. Uma característica curiosa sobre o hélio, é que, quando inalado a voz da pessoa fica muito fina.");
        Distribuicao("2", "--", "--", "--", "--", "--", "--");
    }

    public void Litio() {
        setTitle("Lítio");//3
        jtfMassa.setText("6,941");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ll.jpg")));
        jtaDescricao.setText("Metal branco prateado, cujo nome se deveu à suposição de que só ocorria no reino mineral (do grego lithos, 'pedra' por ter sido descoberto na \n"
                + "petalita, variedade do feldspato), nome que se conservou, todavia, mesmo quando se constatou a presença do elemento nas cinzas das plantas, no\n"
                + "leite e no sangue dos mamíferos, e em muitas águas minerais. Tem seu ponto de fusão em 186ºC. É obtido principalmente do mineral espodumênio,\n"
                + "largamente encontrado na América do Norte e, em pequena extensão na América do Sul. Seus principais usos industriais são: o carbonato de lítio,\n"
                + "em cerâmica de vidro e em graxas lubrificantes; o brometo e o cloreto de lítio, em sistemas condicionadores de ar. O hidróxido é um ingrediente das\n"
                + "baterias alcalinas. Descoberto em 1817 pelo químico suéco Johan August Arfvedson, só foi isolado em 1855, por Bunsen, por eletrólise do cloreto\n"
                + "de lítio, processo usado até hoje");
        Distribuicao("2", "1", "--", "--", "--", "--", "--");
    }

    public void Berilio() {
        setTitle("Berílio");//4
        jtfMassa.setText("9,012182");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/berilio.jpg")));
        jtaDescricao.setText("Foi descoberto por Louis Nicholas Vauquelin em 1797, ao analisar amostra de dois minerais, berilo e esmeralda. A princípio recebeu o nome de\n"
                + "glucínio, do grego glucus, uma vez que seus sais conhecidos na época tinha um sabor mais doce. Whöler o separou em 1828, fazendo agir potássio\n"
                + "sobre cloreto de berílio. Seu principal minério, o berílo é um metal branco prateado, usado moderadamente em ligas de grande dureza e resistência\n"
                + "à tração. Pode ser temperado para usos idênticos ao do aço, em peças resistentes à fadiga. Ocorre em rochas ígneas e é um pouco mas abundante\n"
                + "que o arsênio. Entra ainda an estrutura de outros minerais, porém numa concentração menor. A inalação de vapores de berílio, que se caracteriza\n"
                + "por pneumoconiose e granulomas de várias espécies.");
        Distribuicao("2", "2", "--", "--", "--", "--", "--");
    }

    public void Boro() {
        setTitle("Boro");//5
        jtfMassa.setText("10,811");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/boro.jpg")));
        jtaDescricao.setText("Em 1702, W. Homberg obteve o ácido bórico a partir do boráx e denominou-o sal sedativum. Em 1808, J. L. Gay-Lussac e L. J. Théodon isolaram\n"
                + "o elemento em estado mais ou menos puro. O boro não é encontrado em estado puro na natureza, porém sob a forma de ácido bórico e como\n"
                + "boratos, inclusive o boráx e tincal e a kernita, existindo também sob outras formas. É um elemento necessário ao crescimento das plantas e dessa\n"
                + "forma, essencial à vida animal.\n"
                + "O boro amorfo é um pó marrom. O boro cristalizado mais puro que se encontrou até hoje é muito duro, tem brilho quase metálico. Funde-se a\n"
                + "2300ºC e volatiliza-se um pouco. Em seu estado puro, o boro não é muito empregado, mas na forma de ácido bórico e boráx, encontra grande\n"
                + "aplicação industrial.\n"
                + "O ácido bórico é muito fraco sendo empregado em medicina como antisséptico e na conservação de alimentos e cosméticos, embora essa prática\n"
                + "tenha sido modernamente proibida ou desencoraja, em virtude das qualidades tóxicas do ácido.");
        Distribuicao("2", "3", "--", "--", "--", "--", "--");
    }

    public void Carbono() {
        setTitle("Carbono");//6
        jtfMassa.setText("12,0107");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/carbono.jpg")));
        jtaDescricao.setText("Elemento químico não metálico, sólido, insípido. Encontra-se difundido na natureza em todas as substâncias orgânicas e em muitos minerais.\n"
                + "O diamante e o grafite são suas formas mais puras, onde ele aparece sob a característica crestalina, enquanto os carvões o contêm no estado\n"
                + "amorfo, não cristalizado.\n"
                + "Pela capacidade de suas moléculas se ligarem umas às outras, formando cadeias longas, o carbono dá origem a um número enorme de compostos.\n"
                + "O estudo dessas combinações constitui a química orgânica, mais ampla e mais complexa do que a química dos demais elementos. O número de\n"
                + "compostos de carbono é de cerca de 2 milhões, contra aproximadamente 30 mil compostos inorgânicos.");
        Distribuicao("2", "4", "--", "--", "--", "--", "--");
    }

    public void Nitrogenio() {
        setTitle("Nitrogênio");//7
        jtfMassa.setText("14,0067");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nitrogenio.jpg")));
        jtaDescricao.setText("Elemento não metálico, foi descoberta independentemente por Daniel Rutherford, Joseph Priestley e Carl Wilhem Scheele em 1772, havendo dúvidas\n"
                + "sobre qual dos três a isolou primeiro. Lavousier, o primeiro a reconhecer que se tratava de uma substância simples, deu-lhe o nome de azoto (que\n"
                + "significa o que não mantém a vida). O nome nitrogênio (gerador de nitro) foi introduzido por Chaptal, após a descoberta de sua relação com o ácido\n"
                + "nítrico. Nas condições ambientes o nitrogênio é um gás incolor, inodoro e insípto. Seu ponto de fusão é de -210ºC, e de ebulição -195,8ºC.\n"
                + "O nitrogênio puro pode ser obtido em laboratório por inúmeras reações de oxidação ou por redução de alguns compostos contendo nitrogênio.\n"
                + "O nitrogênio constitui cerca de quatro quintos do ar atmosférico, em volume. Combinado, é um dos constituintes essenciais dos seres vivos, sendo\n"
                + "o seu teor no organismo humano de cerca de 2,4%. O nitrogênio é utilizado na fabricação de amônia, da cianamida cálcica, para endurecimento\n"
                + "superficial do aço, no preenchimento de lâmpadas incandescentes e como gás inerte para impedir certas oxidações.");
        Distribuicao("2", "5", "--", "--", "--", "--", "--");
    }

    public void Oxigenio() {
        setTitle("Oxigênio");//8
        jtfMassa.setText("15,9994");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/oxigenio.jpg")));
        jtaDescricao.setText("Elemento químico gasoso. A descoberta desse gás deve ser considerada como um dos mais importantes progressos da história da química. O ar fora\n"
                + "considerado por muito tempo um elemento, só no fim do século XVIII reconheceu-se ser uma mistura, cujo constituinte ativo é agora chamado\n"
                + "oxigênio. Foi descoberto independentemente por Scheele, em 1772, e por Priestley, em 1774, Scheele o denominou 'ar de fogo' e 'ar vital', e Priestley\n"
                + "'ar deflogisticado'. Porém a importância rel da descoberta escapou dos dois, por serem adéptos da doutrina do flogístico; coube a Lavousier \n"
                + "mostrar que a combustão, a calcinação dos metais e a respiração são fenômenso relacionados entre si. É o elemento mais amplamente distribuído e\n"
                + "o mais comum de todos. Cerca de 23,2% do ar atmosférico, em peso, são constituídos de oxigênio, a água contém cerca de 88,89% do elemento.\n"
                + "É um elemento vital, pois os animais dependem do oxigênio do ar, e os peixes, do ar dissolvido na água, para sua respiração.\n"
                + "Nas grandes altitudes, o ar se torna rarefeito, isto é, a proporção de oxigênio diminui; quando atinge 7%, a vida não é mais possível. Uma vela\n"
                + "apaga-se em ar que contenha menos de 17% de oxigênio. O oxigênio é usado em terapêutica e em casos de respiração artificial, e largamente na\n"
                + "indústria, principalmente em combinação com o acetileno, para soldar a cortar metais.");
        Distribuicao("2", "6", "--", "--", "--", "--", "--");
    }

    public void Fluor() {
        setTitle("Flúor");//9
        jtfMassa.setText("18,9984032");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fluor.jpg")));
        jtaDescricao.setText("É o mais eletronegativo e o mais reativo de todos os elementos químicos. Apresenta-se como um gás amarelo esverdeado, de odor irritante e inalação\n"
                + "perigosa; ponto de ebulição -188ºC;ponto de fusão -223ºC. Foi descoberto por Scheele em 1771, e isolado pela primeira vez por H. Moissan em 1886.\n"
                + "Ocorre na natureza sob a forma de fluoreto de cálcio no mineral fluorita e como fluoreto de sódio e alumínio na criolita.\n"
                + "Seus derivados inorgânicos mais comuns são os fluoretos: o de sódio, usado como preventivo no tratamento das cáries dentárias. Entre seus\n"
                + "compostos orgânicos destacam-se os freons, entre os quais o freon-12, difluordiclorometano, gás refrigerante não tóxico utilizado na maioria dos\n"
                + "refrigeradores domésticos.");
        Distribuicao("2", "7", "--", "--", "--", "--", "--");

    }

    public void Neonio() {
        setTitle("Neônio");//10
        jtfMassa.setText("20,1797");//20,183
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neonio.jpg")));
        jtaDescricao.setText("Descoberto por William Rasmy e M. W. Travers em 1898. Ocorre nao somente na atmosfera, mas também em gases naturais. É obtido por\n"
                + "meio de destilação fracionada do ar líquido. Possui três isótopos estáveis, de massas 20,22 e 23, dos quais o primeiro é predominante, quatro\n"
                + "isótopos radioativos.\n"
                + "Seu ponto de ebulição é -246,09°C, e de solidificação -248,61°C. Não se conseguiram produzir compostos de neônio, com exceção daqueles cujos\n"
                + "átomos se ligam pelas forças de Van der Waalls. É usado especialmente no enchimento de lâmpadas, sobretudo as de cor vermelha-alaranjada\n"
                + "para anúncios luminosos.");
        Distribuicao("2", "8", "--", "--", "--", "--", "--");
    }

    public void Sodio() {//11
        setTitle("Sódio");
        jtfMassa.setText("");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sodio.jpg")));
        jtaDescricao.setText("De início o sódio era mais comumente conhecido sob a forma de cloreto de sódio (sal) e carbonato de sódio, mas, em 1807, Sir Humpry Davy,\n"
                + "estudando a eletrólise de soluções salinas, conseguiu obter o sódio metálico. Fisicamente o sódio apresenta cor branca prateada, é brilhante e mais\n"
                + "leve que a água mole, podendo ser modelado à temperatura ambiente. Seu ponto de fusão é de 97,5ºC e de ebulição 892ºC.\n"
                + "Quimicamente, o sódio é bastante ativo, combina-se com o oxig~enio violentamente, queima facilmente ao ar, e da combustão resulta uma chama\n"
                + "amarela brilhante. A utilização do sódio fez-se mais intensamente na química orgânica. Outras grandes utilizações do sódio são: combinado com o\n"
                + "cloro forma o sal de cozinha, devido ao seu efeito fotoelétrico, o sódio é usado na fabricação de células fotoelétricas, qeu são muito importanes na\n"
                + "televisão, o cinema, as fotografias telegráficas e muitos outros aparelhos modernos. Comercialmente o hidróxido de sódio, conhecido como soda\n"
                + "cáustica, é empregado para alvejamento e tingimento, e também utilizado na fabricação de sabões, pepel e refinação de óleo.");
        Distribuicao("2", "8", "1", "--", "--", "--", "--");
    }

    public void Magnesio() {
        setTitle("Magnésio");//12
        jtfMassa.setText("24,305");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/magnesio.jpg")));
        jtaDescricao.setText("É o metal estrutural mais leve e um dos mais abundantes na natureza, pois só o superam o silício, o alumínio e o ferro. A água do mar contém 0,13%\n"
                + "de magnésio (ou seja 1Kg para cada 1000 litros). Além da água do mar há vários minerais ricos em magnésio, tais como a dolomita, magnesita\n"
                + "e brucita. Em 1852, Robert Bunsen descobriu uma célula eletrolítica para a obtenção de magnésio a partir do cloreto.\n"
                + "O magnésio, como muitas metais puros, necessita de ingredientes que a ele se ligam para foratalecê-lo com fins estruturais. Os principais\n"
                + "ingredientes para muitas ligas comumente usadas são o alumínio, manganês e o zinco.\n"
                + "Os usos do magnésio se divide convenientimente em dois tipos: estruturais e não estruturais. Os primeiros incluem aplicações em forma de ligas de\n"
                + "magnésio, já os usos não estuturais incluem seu emprego como ingrediente para ligas com o alumínio, chumbo. zinco e certas outras ligas não\n"
                + "ferrosas. Também se emprega como desoxidantes e dessulfurizante na refinagem das ligas de níquel e cobre.");
        Distribuicao("2", "8", "2", "--", "--", "--", "--");
    }

    public void Aluminio() {
        setTitle("Alumínio");//13
        jtfMassa.setText("26,9815386");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/aluminio.jpg")));
        jtaDescricao.setText("Metal branco e leve, abundante na crosta terrestre. Representa 7,5% de sua composição. Não se encontra em estado llivre; forma inúmeros\n"
                + "compostos que, em geral contêm oxigênio. O pincipal minério de elumínio é a balxita, cujo nome deriva da cidade de Baux, na França, onde fo\n"
                + "usado pela primeira vez. Geologicamente é o produto da alteração do silicato de alumínio com perda de sílica seguida de hidratação. O alumínio é\n"
                + "encontrado ainda em combinação com o silício e outros elementos, formando feldspato, argilas, micas e caulinas, empregadas na indústria de\n"
                + "cerâmica.\n"
                + "Seu ponto de fusão é 660ºC e ebulição 1.800ºC, muito maleável entre 100 e 150ºC. Quando recozido é facilmente reduzido a lâminas delgadas,\n"
                + "folhas e fios. Não resiste bem a choques e a 530ºC sofre consideráveis modificações em suas propriedades, perdendo a dureza e\n"
                + "tornando-se facilmente pulverizável. É bom condutor de calor e corrente elétrica; quando exposto ao ar seco permanece inaterável, mas em\n"
                + "presença de umidade recobre-se de uma película de óxido, perdendo o brilho. Queima com grande desprendimento de energia em temperatura\n"
                + "superior a700ºC.");
        Distribuicao("2", "8", "3", "--", "--", "--", "--");
    }
    
    public void Silicio(){
        setTitle("Silício");//14
        jtfMassa.setText("28,0855");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/silicio.jpg")));
        jtaDescricao.setText("Elemento químico muito comum na crosta terrestre, que entra na composição da grande maioria das rochas. Para os químicos a importância do\n"
                + "silício é muio grande, pois esse elemento desempenha, em relação aos corpos minerais, um papel muito parecido com o carbono para os corpos que\n"
                + "formam os organismos vivos.O silício possui uma característica semelhante a do carbono, ele forma grandes cadeias, porém seus átomos não estão\n"
                + "diretamente ligados uns aos outros, essa ligação é feita por átomos de oxigênio. Fisicamente é um metalóide que se funde a 1420ºC, entra em\n"
                + "ebulição a 2600ºC. Pode-se obter silício puro por meio de um sal, o tetracloreto de silício. A sílica é o mais importante composto de silício e existe\n"
                + "abundantemente na crosta terrestre.\n"
                + "Alguns compostos de silício que existem na natureza podem ser empregados como materiais refratários, sendo conhecidos desde remota antiguidade\n"
                + "e usados nas antigas forjas, nos revestimentos internos dos fornos siderúrgicos. Há compostos de silício de grande poder absorvente, que por isso\n"
                + "são empregados como antissépticos e secantes em ataduras para curativos.");
        Distribuicao("2", "8", "4", "--", "--", "--", "--");
    }

    public void Fosforo() {
        setTitle("Fósforo");//15
        jtfMassa.setText("30,9737");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fosforo.jpg")));
        jtaDescricao.setText("Metalóide geralmente venenoso; seu nome é derivado do grego phos(luz) e phoros(transportador). Não se encontra livre na natureza pois se oxida\n"
                + "facilmente ao simples contato com o ar; comumente é encontrada em seus compostos com o oxigênio. A descoberta do fósforo data de 1669 e\n"
                + "coube ao alguimista alemão Henning Brand, de Hamburgo, que o separou através de uma destilação da urina evaporada.\n"
                + "Consta que nos fins de 1675 Brand vendeu seu segredo a Johan Drafft, tendo, ao mesmo tempo, informado J. Knuckel que ovtivera fósforo a partir\n"
                + "da urina. Knuckel, após várias experiências com a urina, conseguiu ainda em 1676, obter fósforo sólido; em 1677, Krafft também logro obter\n"
                + "fósforo sólido e informou a Boyle que o obitivera de 'uma parte do corpo humano', mais tarde Boyle publicou um esquema no qual constava um\n"
                + "método para a fabricação do fósforo. Lavousier foi quem demonstrou ser o fósforo um elemento.\n"
                + "Sua circulação na natureza e a seguinte: existindo nas rocas graníticas, pela decomposição das mesmas, atinge o solo, a água dos mananciais e o mar\n"
                + "sob forma de compostos; dái tais produtos são absorvidos pelas plantas. ");
        Distribuicao("2", "8", "5", "--", "--", "--", "--");

    }

    public void Enxofre() {
        setTitle("Enxofre");//16
        jtfMassa.setText("32,065");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/enxofre.jpg")));
        jtaDescricao.setText("Um dos elementos químicos mais importantes, quer no estado puro, quer formando uma diversidade enorme de substâncias com grande emprego na\n"
                + "vida moderna. Já era conhecido desde a Antiguidade, quando foi identificado com o princípio do fogo pelo alquimista árabe Geber (776 da era crisã).\n"
                + "Seu nome português deriva da palavra latina sulfur, de onde se tira o símbolo S.\n"
                + "Entre os gregos e os romanos o enxofre era muito usado para fundições, e os vapores de sua combustão para o branqueamento de tecidos. É\n"
                + "encontrado na natureza tanto em estado livre como combinado, formando principalmente sulfetos e sulfatos. Existem depósitos de enxofre nas\n"
                + "regiões vulcânicas, onde é encontrado nas fissuras das lavas ou em crateras de vulcões extintos. O enxofre de natureza vulcânica representa menos\n"
                + "de 5% da produção mundial, que provém quase totalmente dos depósitos sedimentares.\n"
                + "Seus principais compostos naturais são: galena, blenda, cinábrio, estibina, entre vários outros. O enxofre também é encontrado nos tecidos e\n"
                + "estruturas animais e vegetais, tais como a cebola. o alho, a mostrada, muitos óleos, o pêlo, os ovos, as proteínas, nas águas de muitas fontes, e na\n"
                + "forma de gases sulfurosos. O principal derivado do enxofre é o ácido sulfúrico , conhecido vulgarmente por 'pai da indústria', cujo consumo é tido\n"
                + "como indicador do progresso de uma nação.");
        Distribuicao("2", "8", "6", "--", "--", "--", "--");
    }

    public void Cloro() {
        setTitle("Cloro");//17
        jtfMassa.setText("35,453");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cloro.jpg")));
        jtaDescricao.setText("Elemento químico gasoso da família dos alogênios, isolado pela primeira vez em 1774 por K. W. Scheele. Em 1810, Sir Humphry Davy mostrou que\n"
                + "o gás não podia ser decomposto, e que se tratava portanto de um novo elemento. Continuando suas pesquisas, provou ainda que o ácido clorídrico\n"
                + "era constituido apenas de hidrogênio e do novo elemento, que ele denomunou cloro. A descoberta de Davy prevaleceu sobre a teoria de Lavousier de\n"
                + "que todo ácido continha oxigênio. O nome do elemento foi dado em virtude da sua coloração amarelada(do grego cloros). O cloro não existe na\n"
                + "natureza em forma livre. Estima-se que na crosta terrestre contenha 0,15% em cloro, é na forma de cloretos que ele ocorre com mais frequencia,\n"
                + "como o cloreto de sódio NaCl (sal de cozinha). É um gás amarelo esverdeado, venenoso; ponto de fusão -100,6ºC e de ebulição -34,05ºC. Possui\n"
                + "sete isótopos conhecidos, sendo dois estáveis naturais e cinco radioativos artificiais.\n"
                + "À luz solar, o cloro reage violentamente com o hidrogênio. O cloro livre é guardado sob forma líquida em cilindros de aço sob pressão. Além do\n"
                + "do seu largo emprego na indústria química e no laboratório é ainda usado: para a purificação da água potável; como desinfetante; para o\n"
                + "branqueamento da polpa do papel e de tecidos. O cloro gasoso já foi usado na guerra química.");
        Distribuicao("2", "8", "7", "--", "--", "--", "--");
    }

    public void Argonio() { //18
        setTitle("Argônio");
        jtfMassa.setText("39,948");//39,942
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/argonio.jpg")));
        jtaDescricao.setText("Foi isolado da atmosfera terrestre em 1894 por Lord Rayleigh e Sir William Ramsay. É o gás mais abundante dentre os gases nobres\n"
                + "É obtido industrialmente por destilação fracionada do ar líquido e processos de purificação qúimicos a temperaturas baixas.\n"
                + "O argônio é um gás incolor, inodoro e insípido, quimicamente inerteponto de ebulição -185,7°C e de solidificação -189,3°C.\n"
                + "Existe naturalmente sob três formas isotópicas de números de massa 40,38 e 36, das quais a primeira é predominante.\n"
                + "A produção do Ar40 a partir do K40(potássio) por desintegração radioativa é importante na determinação da idade de fósseis.\n"
                + "Alguns compostos complexos, em que moléculas de argônio preenchemn espaços entre a estrutura cristalina da substância,\n"
                + "foram fabricadas, como o quinol-clorato.\n"
                + "O mais importante uso industrial do argônio é no enchimeto de lâmpadas. É utilizado também em termômetros para medição\n"
                + "de temperaturas extremamente baixas e em cromatografia.");
        Distribuicao("2", "8", "8", "--", "--", "--", "--");
    }
    
    public void Potassio(){
        setTitle("Potássio");//19
        jtfMassa.setText("39,0983");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/potassio.jpg")));
        jtaDescricao.setText("Metal branco-prateado, seu símbolo é o K pois vem do latim kalium. Até época relativamente recente, a principal fonte mundial de fornecimento de\n"
                + "compostos de potássio eram os depósitos de Stassfurt. Durante a I Guerra Mundial, porém, passaram a utilizar-se outras fontes de fornecimento.\n"
                + "Mais recentemente descobriram-se depósitos exploráveis de potássio, principalmente no mar Morto, nos EUA e na Russia. Todas as plantas\n"
                + "terrestrescontêm quantidades consideráveis de compostos de potássio, provenientes do solo. Dái a importância de alguns compostos de potássio\n"
                + "como fertilizantes. É um metal que, exposto ao ar, escurece rapidamente. Funde-se a 63,5ºC e entra em ebulição a 757,5ºC. As suas propriedades\n"
                + "químicas se assemelham com as do sódio. Suas reaçoes porém são mais violentas. Assim, quando colocamos potássio na água é liberado hidrogênio\n"
                + "que se inflama. Utiliza-se o hidróxido de potássio, seu derivado, pela sua característica de eliminar e absorver matéria gasosa, para a dissecação de\n"
                + "gases ou então absorção de óxido de carbono e dióxido de enxofre, sendo ainda indispensável na produção de sabão mole.");
        Distribuicao("2", "8", "8", "1", "--", "--", "--");
    }

    public void Calcio() {
        setTitle("Cálcio");//20
        jtfMassa.setText("40,078");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/calcio.jpg")));
        jtaDescricao.setText("Metal branco prateado, muito mole, dúctil e maleável, não existindo na natureza em virtude da facilidade com que reage com o oxigênio do ar, ou\n"
                + "com a água, formando compostos. Está classificado no grupo dos metais alcalinos terrosos. Foi obtido, pela primeira vez, por Sir Humprhy Davy,\n"
                + "em 1808, mas ainda impuro, e somente em 1898, H. Moissan conseguiu isolá-lo quimicamente puro.. É o quinto elemento mais abundante na\n"
                + "formação da crosta terrestre. Acha-se geralmente disseminado na forma de carbonato de cálcio, como é encontrado nos calcários, nos mármores,\n"
                + "nas conchas dos moluscos e na casca do ovo.\n"
                + "Habitualmente as águas naturais contêm sais cálcio dissolvidos; nos tecidos de plantas e animais e nos ossos também se encontram derivados do\n"
                + "cálcio. Elemento biogenético, contribui para o crescimento e desenvolvimento da vida normal dos seres vivos. Acha-se também na natureza em\n"
                + "combinação com outros elementos. Tem emprego variado em produtos de utilização industrial como pigmentos para pinturas, produtos medicinais\n"
                + "fertilizantes, bem como em construção e em esculturas e estatuária.");
        Distribuicao("2", "8", "8", "2", "--", "--", "--");
    }

    public void Escandio() {
        setTitle("Escndio");//21
        jtfMassa.setText("44,955912");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/escandio.jpg")));
        jtaDescricao.setText("Foi descoberto em 1876 por Lars Fredrik Nilson, em Uppsala na Suécia, embora a sua existência já tivesse sido inferida por Dimitri Mendeleev\n"
                + "em 1868 , com base no seu quadro periódico dos elementos. Na metalurgia o elemento é ligado com o alumínio para formar ligas alumínio-escândio,\n"
                + "usadas em aplicações aeroespaciais, bicicletas e equipamentos esportivos que exigem leveza e resistência elevada.");
        Distribuicao("2", "8", "9", "2", "--", "--", "--");

    }
    
    public void Titanio(){
        setTitle("Titânio");//22
        jtfMassa.setText("47,867");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/titanio.jpg")));
        jtaDescricao.setText("Metal branco acinzentado, lustroso, duro e quebradiço quando frio, mas maleável quando aquecido, e dúctil quando puro. Tem boa resistência a\n"
                + "corrosão a temperatura ambiente. Já foi imerso por três anos em água do mar sem que nada sofresse; é por isso empregado na indústrias químicas.\n"
                + "É emcpmtradp mp Sol e nos meteoritos, e a nave espacila Apolo 11 trouxe rochas lunares com 7 a 12% de titânio. Na Terra, contudo não existe\n"
                + "em estado livre; combinado tem ampla distribuição. Comercialmente pode ser obtido pela redução do tetracloreto de titânio. Foi descoberto em 1791\n"
                + "pelo clérigo inglês William Gregor, que investigava a terra negra de Cornwall. Em 1795 foi encontrado no rutilo por Martin Heinrich Klaproth;\n"
                + "pensando-se tratar de um novo elemento, chamou pelo nome que hoje tem.\n"
                + "A produção de titânio metálico só se tornou possível depois que William Justin Kroll, refugiado alemão, inventou nos EUa um processo de redução\n"
                + "a magnésio em 1936.");
        Distribuicao("2", "8", "10", "2", "--", "--", "--");
    }
    
    public void Vanadio(){
        setTitle("Vánadio");//23
        jtfMassa.setText("50,9415");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/vanadio.jpg")));
        jtaDescricao.setText("Descoberto em 1801 por Andrés Manuel Río, que na época confundiu o novo elemento com o cromo impuro, o vanádio foi reconhecido em 1830\n"
                + "pelo Sueco Gabriel Sefström, e batizado em homenagem a Vanadis, deusa escandinava da juventude e da beleza. De cor branco prateada e sólido à\n"
                + "temperatura ambiente, é o 22º elemento em abundância na crosta terrestre, combinado com minerais, carvão e petróleo. Suas principais fontes são\n"
                + "a carnotita, a vanadita e o petróleo do México e da Venezuela. Em 1867, foi isolado pela primeira vez por Henry Enfield Roscoe, por redução do\n"
                + "cloreto de vanádio com hidrogênio gasoso. É utilizado na fabricação de aços especiais (aços de vanádio), caracterizados por sua grande resistência\n"
                + "e tenacidade. O pentóxido de vanádio é utilizado principalmente como catalisador de oxidação, na fabricação de ácido sulfúrico; na indústria de\n"
                + "corantes. O vanádio e seus compostos são tóxicos e, por essa razão devem ser manuseado com o máximo de cuidado.");
        Distribuicao("2", "8", "11", "2", "--", "--", "--");
    }

    public void Cromo() {
        setTitle("Cromo");//24 
        jtfMassa.setText("51,9961");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cromo.jpg")));
        jtaDescricao.setText("Elemento químico metálico de cir branco azulada. Em 1762, foi descrito, pela primeira vez, um mineral contendo cromo, em amostra provenientes\n"
                + "da Sibéria, mas somente em 1797 L. N. Vauquelin o identificou como óxido de um novo metal, ao qual denominou cromo, do grego chroma, cor,\n"
                + "devido a sua coloração. Hoje sabemos que tal metal é a crocoisita (crdomato de chumbo).\n"
                + "O cromo metálico não existe livre na natureza: encontra-se combinado ao oxigênio no ocre de cromo, combinado ao ferro na cromita sendo este seu\n"
                + "principal menério. Algumas pedras preciosas, esmeralda, jade, o rubi e a safira, devem a sua cor à presença de cromo na sua constituição.\n"
                + "É um metal extremamente duro, mais duro que o irídio e o aço, capaz de adquirir grande brilho por polimento, encontrando desta forma vasta\n"
                + "aplicação industrial. Nas condições normais é estável em presença do ar, porém aquecido oxida-se superficialmente. Quando submetido a agentes\n"
                + "corrsivos normais, inclusive á chuva, á neve, água do mar, compostos de enxofre etc., mantém o aspecto brilhante. Ponto de fusão: 1765°C.\n"
                + "Também se emprega os sais de cromo na proteção de superfícies expostas á corrosão, em cerâmica, no fabrico de refratários, na fabricação de\n"
                + "vidros, como pigmentos na indústria de tintas, em tinturaria como mordente e no curtimento de couro.");
        Distribuicao("2", "8", "13", "1", "--", "--", "--");
    }

    public void Manganes() {
        setTitle("Manganês");//25
        jtfMassa.setText("54,938045");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/manganes.jpg")));
        jtaDescricao.setText("Metal de cor prata, é quimicamente ativo, deixando-se corroer pelo ar úmido e por muitas soluções químicas. Não é magnético a nenhuma\n"
                + "temperatura, prém forma diversos compostos, magnétivos, onde se encontram boretos e nitretos. O manganês se encontra na natureza em diversos\n"
                + "minerias. Somente os minerais oxidasdos são fontes importantes de managanês. Na fabricação de pílahs secas se utiliza um tipo especial de dióxiido\n"
                + "de manganês natural. Quase todo o manganês desse tipo vem de uma mesma mina, em Gana.\n"
                + "Consome-se o manganês em consideráveis quantidades na indústria siderúrgica, na produção de ferroligas, seu ponto de fusão é próximo de 2061ºC");
        Distribuicao("2", "8", "13", "2", "--", "--", "--");
    }

    public void Ferro() {
        setTitle("Ferro");//26
        jtfMassa.setText("55,845");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ferro.jpg")));
        jtaDescricao.setText("Conhecido desde os tempos pré-históricos, deu origem à denominação de Idade do Ferro, período histórico que secedeu à Idade do Bronze. Contas\n"
                + "de ferro foram encontradas nas tumbas de El-Gezerat, Egito, datando de 4.000 a.C. O ferro é geralmente obtido pela redução do trióxido de ferro\n"
                + "em altos-fornos. Quando puro o ferro tem cor cinzenta brilhante; ponto de fusão, 1.530ºC; ponto de ebulição 2.735ºC. Destaca-se entre suas\n"
                + "propriedades físicas o magnetismo. Parece que tal propriedade é apresentada somente pela ferrita, mas, sabe-se que o ferro doce adquire magnetismo\n"
                + "quando submetido à ação de uma corrente elétrica. Em temperatura ambiente o ferro é inalterável sob ação do ar seco, porém, quando submetido ao\n"
                + "ar úmido transforma-se lentamente em ferrugem. Para a proteção do ferro contra a ferrugem pode-se revesti-lo de uma camada de metal mais\n"
                + "resistente à corrosão como o zinco. Aquecido ao vermelho e submetido ao ar, ele queima, dando peróxido de ferro. O ferro decompõem o vapor\n"
                + "d'água ao vermelho, desprendendo hidrogênio e formando peróxido de ferro. Por fim, o ferro ataca facilmente os ácidos. Sua utilização é constante,\n"
                + "porém a sua utilização específica depende de qual dos vários tipo de ferro, cada um tem empregos diferentes.");
        Distribuicao("2", "8", "14", "2", "--", "--", "--");

    }

    public void Cobalto() {
        setTitle("Cobalto");//27
        jtfMassa.setText("58,933195");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cobalto.jpg")));
        jtaDescricao.setText("Elemento químico metálico descoberto por G. Brandt em 1730. Minérios contendo colbalto já eram utilizados desde a antiguidade como pigmento\n"
                + "dele vem a cor azul da porcelana chinesa da dinastia Ming. O termo germânico Kobald (duende) foi dado no século XVI a um minério extraído\n"
                + "das montanhas Harz, na Europa central, que se julgava ser minério de cobre. O cobalto é encontrado principalmente em dois minérios naturais:\n"
                + "esmaltita e cobaltita.\n"
                + "Metal branco-prateado, ferromagnético, mais duro e tenaz do que o ferro e o níquel, com os quais se assemelha pro suas propriedades: ponto de\n"
                + "fusão 1.495ºC; ponto de ebulição 2.900ºC. Possui oito isótopos radioativos artificialmente preparados, entre os quais se destaca, por suas aplicações\n"
                + "o cobalto-60.\n"
                + "Usa-se o cobalto metálico principalmente em: ligas para imãs permanentes; ligas para ferramentas de alta velocidade; ligas resitentes ao calor e a\n"
                + "corrosão; ligas para dentistas e cirurgiões. Na indústria de vidro, cerâmica, tintas e plásticos, os compostos de cobalto são empregados como\n"
                + "pigmentos; na indústria química, como catalisador em análise. O cobalto é indispensável ao organismo animal sendo um dos constituintes da\n"
                + "vitamina B-12. Na medicina o cobalto-60 é empregado no tratamente de lesões cancerosas.");
        Distribuicao("2", "8", "15", "2", "--", "--", "--");
    }

    public void Niquel() {
        setTitle("Níquel");//28
        jtfMassa.setText("58,6934");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/niquel.jpg")));
        jtaDescricao.setText("Metal branco regularmente duro, que funde a 1455ºC e é muito pouco magnético. Possui a característica de melhorar as propriedades da maior parte\n"
                + "dos metais e ligas que se junta. O metal e mais de 3000 de suas ligas são usados, principalmente, pela resistência à corrosão, aliada a grande dureza e\n"
                + "ductibilidade. À temperatura ambiente é em presença do ar e queima em atmosfera de oxigênio, formando óxido de níquel. Não é atacado pela água,\n"
                + "mas, ao rubro, decompõem o vapor d'água.  O níquel, parece ser conhecido desde épocas remotas, pelos chineses. Na Europa, até fins do séc. XVII,\n"
                + "aplicava-se o termo alemão Kupernickel (falso cobre), para designar o minério que tinha o aspecto geral de um minério de cobre. Foi isolado por\n"
                + "A. F. Cronstedt em 1751 e, mais tarde, Bergman tendtou sem êxito prepará-lo sinteticamente. Os principais óxidos de níquel são: óxidos e hidróxidos\n"
                + "e sais. O maior dos depósitos minerais de níquel conhecido foi descoberto no distrito de Sudbury, Ontário, em 1883. Os minerais desse depósito são\n"
                + "refinados nos EUA e desde 1904 constituem a maior fonted de abastecimento mundial. Existem três classes principais de minérios de níquel:\n"
                + "(1) sulfetos, que são encontrados no Canadá, Noruega, Finlândia, Suécia etc., (2) silicatos, que se encontram na Nova Caledônia, Cuba, Brasil,\n"
                + "Russia etc., (3) arsenitos, encontrados na Europa, Canadá, Espanha e EUA.");
        Distribuicao("2", "8", "16", "2", "--", "--", "--");
    }

    public void Cobre() {
        setTitle("Cobre");//29
        jtfMassa.setText("63,546");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cobre.jpg")));
        jtaDescricao.setText("Descoberto e usado pela primeira vez pelo homem no Neolítico, por volta de 8.000 a.C. Encontrado sobre forma metálica livre na natureza e\n"
                + "possuindo grande maleabilidade, foi utilizado pelo homem como substituto da pedra na fabricação de machados, facas e outros utensílios. A\n"
                + "metalurgia docobre parece ter alcançado grande desenvolvimente no Egito, onde em 5000 a.C. todos os instrumentos encontrados em túmulos para\n"
                + "uso dos mortos já eram de cobre.\n"
                + "O cobre encotra-se largamente difundido na crosta terrestre, assim com em sedimentos oceânicos e fluviais, nas cinzas de algas marinahs e outras\n"
                + "plantas, no fígado humano, como núcleo de uma proteína respiratórias dos molúscos entre outros. É um metal vermelho amarelado, muito maleável\n"
                + "e dúctil, e, embora não possua grande tenacidade e dureza, estas propriedades crescem bastantes quando o metal é trabalhado a frio. Possui ponto\n"
                + "de fusão de 1.083ºC e de ebulição de 2.595ºC. Possui dois isótopos estáveis e nove radioativos. É excelente condutor de eletricidade. Não é\n"
                + "atacado pelo ar seco, mas em ar úmido contendo dióxido de carbono forma-se uma camada protetora.\n"
                + "O cobre está em segundo lugar entre os metais utilizado pelo homem, superado apenas pelo ferro. Encontra emprego em construções e\n"
                + "aparelhagem, e como é excelente condutor de eletricidade encontra larga utilização na indústria de fios e cabos elétricos.");
        Distribuicao("2", "8", "18", "1--", "--", "--", "--");
    }
    
    public void Zinco(){
        setTitle("Zinco");//30
        jtfMassa.setText("65,38");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zinco.jpg")));
        jtaDescricao.setText("Metal de cor branca, quebradiço, quando na temperatura ambiente; maleável e dúctil entre 100C e 150C; quimicamente ativo. Seu peso atômico foi\n"
                + "determinado por vários processos: análise de compostos halogenados, síntese de seus óxidos e a partir das densidades dos compostos voláteis.\n"
               + "Na natureza o zinco ocorre de formas diversas, como o carbonato, no chamado espaço de zinco; sulfeto, na conhecido blenda; silicato, na calamina\n"
                + "; óxido, na zincita, mais conhecida por minério vermelho de zinco.\n"
                + "Desde os tempos bíblicos o zinco já era citado, embora hoje se creia que se tratava do bronze. O termo zinco só foi empregado por Parecelso.\n"
                + "A utilização do zinco faz-se sentir constantemente na fabricação de pilhas, graças à sua reação muito lenta com os ácidos; em chapas, empregadas\n"
                + "na cobertura de casas; no fabrico de ligas, ondee se destaca o latão, liga de zinco e cobre; no revestimento do ferro, conhecido como ferro\n"
                + "galvanizado, obtido quando se mergulha o ferro decapado com ácido clorídrico em zinco fundido, capeamento que protege o ferro da ferrugem,\n"
                + "sendo por isso muito uilizado no fabrico de utensílios domésticos. Entre compostos de zinco, destacam-se o óxido de zinco, usado na vulcanização\n"
                + "da borracha, e o sulfeto de zinco, empregado na metalurgia do próprio metal.");
        Distribuicao("2", "8", "18", "2", "--", "--", "--");
    }

    public void Galio() {
        setTitle("Gálio");//31
        jtfMassa.setText("69,723");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/galio.jpg")));
        jtaDescricao.setText("É o metal com o menor ponto de fusão de todos já conhecidos, é capaz de literalmente derreter nas mãos, mas não necessariamente com menor\n"
                + "ponto de ebulição. Apresenta coloração prateada brilhante quando sólido, grisáceo quando fundido e, tal como gelo na água, a diferença de densidade\n"
                + "faz com que a amostra ao se solidificar flutue na fase líquida. Seu ponto de fusão é de aproximadamente 30ºC, porém seu ponto de ebulição fica\n"
                + "próximo de 2175ºC. Sendo um dos maiores intervalos fusão-ebulição identificados. É semicondutor de eletricidade e conduz o calor 2 vezes menos\n"
                + "que o ferro. Semelhante ao alumínio, o gálio encontra-se amplamente distribuído na crosta terrestre. Porém, é praticamente impossível encontrá-lo\n"
                + "puro  geralmente está agregado a minérios de alumínio sob forma de hidróxido, zinco ou germânio. Também é possível encontrá-lo em resíduos\n"
                + "de chaminés. A aplicação principal do gálio está na indústria de produção de semicondutores: pode-se fabricar, pro exemplo, diodos, LEDs, ou\n"
                + "transistores. Além de sensores de temperatura, luz e campos magnéticos.");
        Distribuicao("2", "8", "18", "3", "--", "--", "--");
    }

    public void Germanio() {
        setTitle("Germânio");//32
        jtfMassa.setText("72,63");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/germanio.jpg")));
        jtaDescricao.setText("o germânio é hoje considerado um metal. Nas condições ambiente é sólido, duro (dessa forma, quebradiço), de brilho intenso e coloração branco-\n"
                + "acinzentada. E, na natureza (assim como outros metais) praticamente não é encontrado sob forma elementar, mas como componente de minérios \n"
                + "complexos (a germanita, por exemplo). Foi previsto por Mendeleev como eka-silício com uma precisão incrível de detalhes, mesmo não havendo\n"
                + "nenhum vestígio ou amostra de tal elemento até então. Apresenta estrutura cristalina semelhante ao do diamante quando em estado natural.\n"
                + "Caracteriza-se como um semicondutor e pode ser considerado um bom condutor de calor; é 30% menos eficiente que o ferro, mas é 70 vezes mais\n"
                + "condutor que o vidro ou 100 vezes que a água. Os valores respectivos de ponto de fusão e ebulição são 938°C e 2832°C.\n"
                + "Os minérios mais ricos em germânio são a germanita, a argirodita e a ranierita.\n"
                + "As principais aplicações estão relacionadas à constituição de ligas metálicas ou sob forma pura mesmo:\n"
                + "Circuitos integrados de alta velocidade, amplificadores de baixa intensidade, etc.; espectroscópios e outros instrumentos baseados na óptica de\n"
                + "infravermelhos; adição ao cobre para aumento de resistência química ou ao berílio para aumento de ductibilidade; entre outras.");
        Distribuicao("2", "8", "18", "4", "--", "--", "--");
    }

    public void Arsenio() {
        setTitle("Arsênio");//33
        jtfMassa.setText("74,9216");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/arsenio.jpg")));
        jtaDescricao.setText("Elemento altamente venenoso; já era conhecido pelos antigos, que o consideravam uma espécie de enxofre, mas ao que parece, só no século V foi\n"
                + "extraído do anidrido arsenioso e de seus compostos sulfurados.\n"
                + "Encontra-se excepcionalmente livre e nativo, poucas vezes cristalizados. Apresenta-se de preferência em massas compactas, em veios nas rochas\n"
                + "cristalinas e nos xistos, acompanhado de vários minérios de atimônio e prata.\n"
                + "O arsênio tem cor cinzenta de aço e brilho metálic, é muito quebradiço; só pode ser liquefeito sob pressão, a 814ºC; é bom condutor elétrico.\n"
                + "Aproxima-se quimicamente do fósforo; ao contato com ar seco e na temperatura ordinária, não se altera; ao ar úmido oxida-se; queima a 180ºC,\n"
                + "com chama azulada. Seus compostos são tóxicos especialmente os solúveis em água. Os principais sintomas de envenenamento por arsênio são:\n"
                + "náuseas, vômitos, diarréia, dores musculares, pulso fraco e coma. No comércio o mais importante derivado do arsênio é o óxido arsenioso, mais\n"
                + "conhecido como 'arsênio branco', muito empregado na fabricaçãlo de inseticidas e produtos destinados a exterminação de ervas daninhas e ratos.\n"
                + "O arsênio inorgânico é receitado contra anemia, reumatismo etc., e seus compostos orgânicos contra a síflis e a doença do sono.");
        Distribuicao("2", "8", "18", "5", "--", "--", "--");
    }
    
    public void Selenio(){
        setTitle("Selênio");//34
        jtfMassa.setText("78,96");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/selenio.jpg")));
        jtaDescricao.setText("Foi descoberto por J.J. Berzélius no ano de 1817, movido pela afirmação de Martin Klaprot, de que a coloração residual, de um subproduto da\n"
                + "fabricação do ácido sulfúrico tratava-se de telúrio, porém Berzélius não satisfeito com as afirmações submeteu à amostra a análise concluindo que, o\n"
                + "resíduo se tratava de um novo elemento químico. Estava descoberto o selênio, que recebeu esse nome proveniente do grego “Selene”, que significa\n"
                + "deusa Lua. Seu ponto de fusão é 220ºc, e de ebulição 685ºC. O selênio é elemento que apresenta características muito parecidas com as do enxofre\n"
                + "e telúrio. É obtido como subproduto a partir de resíduos da purificação eletrolítica de metais nobres em âmbito industrial e também é encontrado na\n"
                + "castanha-do-pará que é uma das fontes do elemento para os seres vivos. O selênio nas quantidades adequadas faz parte da nutrição humana e\n"
                + "encontramos carnes e vegetais principalmente.\n"
                + "O elemento é utilizado no processo de fabricação do vidro, tintas como conferente de cor vermelha, no vidro comumente como descorante, em sua\n"
                + "forma metálica a fabricação de células fotovoltaicas devido a sua propriedade de transformar energia luminosa em energia elétrica.");
        Distribuicao("2", "8", "18", "6", "--", "--", "--");
    }

    public void Bromo() {
        setTitle("Bromo");//35
        jtfMassa.setText("79,904");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bromo.jpg")));
        jtaDescricao.setText("Elemento químico da família dos halogênios, foi isolado pela primeira vez em 1826 por A. J. Balard, que uilizou com matéria-prima salmouras\n"
                + "resultantes da evaporação da água do Mediterrânio. Não existe livre na natureza. Na água do mar aparece na proporção de 67mg/l, sob a forma de\n"
                + "brometos metálicos; em toda a crosta terrestre existe 0,0006% do metalóde. Empregando-se como matéria-prima a água mãe das salinas, o\n"
                + "processo de obtenção do bromo é o seguinte: injeta-se cloro e vapor d'água numa torre de cerâmica, do alto da qual se esparge a salmora quente.\n"
                + "O bromo é liberado, carregado pelo vapor e condensado. O condensado é então seprado em extratos, aquoso e halogênico, sendo o primeiro\n"
                + "reintroduzido na torre e o segundo destilado, obtendo-se o bromo com cerca de 99,8% de pureza. O bromo é produzido nos EUA, França,\n"
                + "Alemanha e Inglaterra.É um líquido fumegante, de cor marrom, vapores avermelhados que irritam os olhos e a garganta. Em contato com a pele\n"
                + "causa feridas dolorosas. Seu ponto de solidificação é de -7,2ºC, e o de ebulição 58,8ºC. Possui dois isótopos estáveis e numerosos isótopos\n"
                + "radioativos artificiais. É solúvel em água, éter, álcool etílico e vários outras substâncias.\n"
                + "O brometo de prata BrAg e outros brometos metálicos têm lagra aplicação em fotografia; os brometos metálicos e orgânicos têm aplicação em\n"
                + "medicina como sedativos e anestésicos, o dibrometo é utilizado como anticoagulante da gasolina e esterelizante do solo.");
        Distribuicao("2", "8", "18", "7", "--", "--", "--");
    }

    public void Criptonio() { //36
        setTitle("Criptônio");
        jtfMassa.setText("83,798");//83,80
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/criptonio.jpg")));
        jtaDescricao.setText("Foi descoberto na atmosfera em 1898 por William Ramsay e M. W. Travers. Não é muito abundante na atmosfera, sendo obtido\n"
                + "industrialmente em escala modesta pela destilação fracionada do ar líquido.\n"
                + "O criptõnio possui seis isótopos estáveis, dos quais o mais abundante é o Kr84, e diversos isótopos radioativos. Seu ponto de\n"
                + "ebulição é de -153,23°C e de solidificação -157,0°C. Não é completamente inerte, tendo sido produzido um tetrafluoreto de criptônio KrF4, sólido\n"
                + "branco volátil. Forma ainda composto de baixa estabilidade, em que os átomos se ligam pelas denominadas forças de Van der Waals. É empregado\n"
                + "em certas lâmpadas especiais, como as chamadas lâmpadas pisca-pisca e de lâmoadas flash.");
        Distribuicao("2", "8", "18", "8", "--", "--", "--");
    }
    
    public void Rubidio(){
        setTitle("Rubídio");//37
        jtfMassa.setText("85,4678");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rubidio.jpg")));
        jtaDescricao.setText("Descoberto em 1861, por Robert Bunsen e Gustav Kirchoff. Ocorre em minérios como a carnalita, a polucita, a leucita e zinvaldita. Pode ser retirado\n"
                + "da salmora dos lagos ricos em sais de potássio ou preparado em laboratório pela redução do cloreto de rubídio com cálcio.\n"
                + "Arde espontaneamente com o ar e reage violentamente em presença da água; por isso o rubídio é conservado em óleo mineral seco ou em uma\n"
                + "atmosfera de hidrogênio. É empregado na fabricação de vidros especiais, nas células fotoelétricas, e em relógios atômicos (mas não tem a mesma\n"
                + "precisão que o césio)");
        Distribuicao("2", "8", "18", "8", "1", "--", "--");
    }

    public void Estroncio() {
        setTitle("Estrôncio");//38
        jtfMassa.setText("87,62");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estroncio.jpg")));
        jtaDescricao.setText("Elemento químico metálico descoberto por W. Cruiksnank, em 1787, e isolado pela primeira vez em 1808 por Sir Hupry Davy, que submeteu uma\n"
                + "mistura úmida de cloreto de estrôncio e óxido de marcúrio à eletrólise, utilizando cátodo de mercúrio. O metal é obtido pela eletrólise do cloreto\n"
                + "fundido, ou pelo aquecimento do hidreto, no vácuo, a 1.000ºC. Não é produzido comercialmente em grandes quantidades, pois ocorre em pequenas\n"
                + "concentrações. É um metal branco-prateado, maleável, dúctil, bom condutor de eletricidade. Funde-se a 769ºC e ebtra em ebulição a 1.380ºC.\n"
                + "Oxida-se rapidamente quando exposto ao ar; queima no ar aquecido, emeitindo luz brilhante e formando óxido e o nitreto; reage com água,\n"
                + "produzindo o hidróxido e liberando hidrogênio. É menos básico que o bário, e mais do que o cálcio .\n"
                + "O estrôncio não é tão utilizado quanto o cálcio e o bário, com os quais se assemelha. O monóxido é empregado na indústria do açúcar; o nitrato\n"
                + "produz a luz vermelha, em pirotecnia. O Reino Unido é o maior produtor comercial do metal.");
        Distribuicao("2", "8", "18", "8", "2", "--", "--");
    }

    public void Itrio() {
        setTitle("Ítrio");//39
        jtfMassa.setText("88,905");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/itrio.jpg")));
        jtaDescricao.setText("Descoberto em 1794 pelo químico finlandês Johan Gadolin, foi obtido impuro, pela primeira vez, em 1828, por Whöler. Mais abuntante do que o\n"
                + "escândio e o lantânio, ocorre em todos os minérios de terras-raras. No solo lunar, segundo amostras trazidas pela Apolo 11, o contúdo de ìtrio é bem\n"
                + "mais alto do que na Terra. Metal prateado, lustroso e estável no ar, torna-se instável quando finamente dividido, inflama-se a 470ºC. Apresenta\n"
                + "apenas um isótpo natural o ítrio 94. O óxido de ítrio é o seu composto mais importante, com grande aplicação em cerâmica e na composição de\n"
                + "certos vidros, onde se exija resistência a choques e baixas características de expansão. É largamente empregado nos tubos de televisão a cores,\n"
                + "como fósforo-ativador e responsável pela cor vermelha. Seu ponto de fusão é de 1509ºC e de ebulição 2927ºC.");
        Distribuicao("2", "8", "18", "9", "2", "--", "--");
    }

    public void Zirconio(){
        setTitle("Zircônio");//40
        jtfMassa.setText("91,224");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zirconio.jpg")));
        jtaDescricao.setText("Encontra-se na natureza sob a forma de silicato de zircônio, também chamado de zircão, e como dióxido de zircônio. O metal é extraído da redução\n"
                + "do dióxido, forno elétrico, por meio de aquecimento com o cálcio. No Brasil eses materila pode ser encontrado sob a forma de grandes massas. Esse\n"
                + "material encontra-se no planalto de Poços de Caldas. O zirõnio tem sido usado para remover o oxigênio na fabricação de aços especiais, sendo o\n"
                + "dióxido de zircônio utilizado como material refratário na preparação de cadinhos e em alto-fornos especialmente empregados para o fabrico de vidros\n"
                + "especiais.");
        Distribuicao("2", "8", "18", "10", "2", "--", "--");
    }
    
    public void Niobio() {
        setTitle("Nióbio");//41
        jtfMassa.setText("92,90638");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/niobio.jpg")));
        jtaDescricao.setText("Foi descoberto em 1801, pelo químico inglês Charles Hatchett, num minério de cromo levado da América do Norte para a Inglaterra. Recebeu então\n"
                + "o nome de colúmbio, mas o químico alemão Henrich Rose, em 1844, chamou-lhe nióbio (de Níobe, a deusa metológica filha de Tântalo),\n"
                + "denominação que se tornou definitiva. Em estado puro é maleável e dúctil,; quando polido, parece-se com platina. É usado soretudo em ligas; e, em\n"
                + "pequenas quantidades, nos aços inoxidáveis, para evitar corrosão. Ocorre juntamente com o tântalo em minerais como a columbita e a tantalita.\n"
                + "O nióbio é resistente ao ataque dos ácidos, com exceção do ácido fluorídrico, é duro e tem alto ponto de fusão, próximo dos 2416ºC. É usado na\n"
                + "fabricação de aços para turbinas. Exstem grandes reservas no Canadá, Nigéria, Zaire, EUA e, principalmente no Brasil (Rio Grande do Norte,\n"
                + "Paraíba, Ceará, Bahia e Minas Gerais, onde, no município de Araxá, ocorre o que se acredita ser a maior reserva mundial de nióbio).");
        Distribuicao("2", "8", "18", "12", "1", "--", "--");
    }

    public void Molibdenio() {
        setTitle("Molibdênio");//42
        jtfMassa.setText("95,96");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/molibdenio.jpg")));
        jtaDescricao.setText("Metal branco prateado, muito duro e resistente, menos quebradiço que o tungstênio. O molibdênio deve seu nome a uma curiosa confusão de termos\n"
                + "originada pela grande semelhança do mineral molibdenita com o grafito. Foi isolado pela primeira vez por Hjelm, em 1782, ao aquecer ácido\n"
                + "molíbdico com carvão. Seus principais minérios são: o trióxido e o dissulfeto. É bastante utilizado em eletrônicos(tubos de rádio e raio X) e o seu\n"
                + "mais amplo campo na indústria química está na produção de pigmentos para tintas.");
        Distribuicao("2", "8", "18", "13", "1", "--", "--");
    }
    
    public void Tecnecio(){
        setTitle("Tecnécio");//43
        jtfMassa.setText("98");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tecnecio.jpg")));
        jtaDescricao.setText("O tecnécio é um metal radioativo, cinza prateado que se oxida lentamente em presença da umidade do ar. Foi o primeiro elemento a ser produzido\n"
                + "artificialmente em laboratório. A sua descoberta foi atribuída a Carlos Perrier e Emilio Segre que, em 1939, btiveram o elemento utilizando o ciclotron,\n"
                + "bombardeando uma amostra de molibdênio com isótopos pesados de hidrogênio em Berkeley, Califórnia. A química do tecnécio é semelhante à\n"
                + "química do rênio. O elemento se dissolve em ácido nítrico, água-régia e ácido sulfúrico concentrado. Não é solúvel em ácido clorídrico.\n"
                + "Reage com enxofre em temperaturas elevadas, formando dissulfeto de tecnécio. Funde-se a 2430ºC e entra em ebulição a 4538ºC.");
        Distribuicao("2", "8", "18", "13", "2", "--", "--");
    }
    
    public void Rutenio(){
        setTitle("Rutênio");//44
        jtfMassa.setText("");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rutenio.jpg")));
        jtaDescricao.setText("Foi identificado como elemento químico por Carl Glaus, na Rússia em 1844. Foi o último metal do grupo da platina a ser caracterizado. É difícil de\n"
                + "fundí-lo, pois seu ponto de fusão alcança 2450ºC e o de ebulição ultrapassa os 2700ºC. Tem cor e brilho semelhantes aos da platina. Não é atacado\n"
                + "pelo ar frio. Aquecido acima de 700ºC, o metal em pó produz um dióxido de cor azul-escura. O elemento resiste ao ataque de ácidos.\n"
                + "Sua aplicação na indústria é restrita. Utiliza-se em ligas com platina e outros metais do mesmo grupo. Ligas de platina com rutênio e irídio ou paládio\n"
                + "com rutênio e ródio são usadas em joalheria por sua grande dureza.");
        Distribuicao("2", "8", "18", "15", "1", "--", "--");
    }
    
    public void Rodio(){
        setTitle("Ródio");//45
        jtfMassa.setText("102,9055");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rodio.jpg")));
        jtaDescricao.setText("Elemento químico metálico, foi isolado pelo físico inglês Willia H. Wollaston, em 1804. Seu ponto de fusão é de 1980ºC e de ebulição é superioir a\n"
                + "2500ºC. A superfície do metal é prateada e brilhante, com alta reflexibilidade, propriedade que se mantém inalterada mesmo ao contato prolongado\n"
                + "do ar ambiente. O ródio é empregado na fabricação de superfícies refletoras metálicas e em joalheria; em particular, uma leve camada de ródio evita\n"
                + "o enegrecimento das superfícies de prata. É empregado em ligas com platina, de grande dureza.\n"
                + "O ródio ocorre em estado nativo juntamente com os minérios de platina, numa quantidade máxima de 2%, e misturado a outros metai do grupo,\n"
                + "como o ósmio, o rutênio, o irídio e o paládio. É praticamente inatacável pelos ácidos, mas dissolve-se em soluções de sulfato ácido de potássio.");
        Distribuicao("2", "8", "18", "16", "1", "--", "--");
    }

    public void Paladio() {
        setTitle("Paládio");//46
        jtfMassa.setText("106,42");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/paladio.jpg")));
        jtaDescricao.setText("É um metal de transição, nas condições ambiente é sólido, de aparência branco prateada de brilho metálico (essa aparência mantém-se\n"
                + "indefinivelmente, mesmo se exposto ao ar, já que é pouco reativo com o oxigênio). Seu ponto de fusão está próximo de 1550ºC e o de ebulição\n"
                + "3140ºC. Também é bom condutor de calor e de eletricidade (nesse quesito é praticamente igual ao ferro). O paládio é quase sempre encontrado na\n"
                + "natureza associado à platina ou outro metal do mesmo grupo, com concentração na crosta terrestre não muito expressiva.\n"
                + "Alguns minérios podem possuir pequenas quantidades de paládio na sua composição, a exemplo da molibdenita e ferrimolibdita. As principais\n"
                + "reservas se encontram na Sibéria, Canadá e África do Sul.  Outros depósitos são vistos na Colômbia e Alasca que, apesar de serem tais como vários\n"
                + "outros, são mais economicamente viáveis para extração.\n"
                + "As principais aplicações são: fabricação de contatos eletromecânicos; na ondontologia para reparo nos dentes (próteses); na medicina, em geral, na\n"
                + "forma de instrumentos cirurgicos; como liga com o ouro (junto com outros metais, como prata ou níquel) gerando por consequênciao ouro branco.\n"
                + "Seu preço de venda é, em geral, um terço do valor do preço de venda do ouro 24 quilates (praticamente puro).");
        Distribuicao("2", "8", "18", "18", "--", "--", "--");
    }
    
    public void Prata(){
        setTitle("Prata");//47
        jtfMassa.setText("107,8682");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/prata.jpg")));
        jtaDescricao.setText("Metal branco brilhante, que se apresnta amarelo se a luz se refletir em sua superfície muitas vezes antes de atingir a vista. Em lâminas muito delgadas\n"
                + "tem coloração azulada. Pulverizada, é cinzenta e de aparência terrosa. Seu símbolo é Ag pois vem do latim argentum. Há referências à prata no\n"
                + "Antigo Testamento. O metal é conhecido desde os tempos mais remotos, e, provavelmente, seu uso como moeda é tão antigo quanto o do ouro.\n"
                + "A prata é encontrada acasionalmente, em forma nativa, em grandes massas ou cristalizada, associada ao cobre metálico, ouro, etc. Seus principais\n"
                + "minérios são: argentita, sulfeto, cerargirita e o cloreto, encontrados no México, Peru, Chile, Bolívia, EUA, Austrália etc. Ocorre, também\n"
                + "frequentemente associada ao chumbo na galena. A prata é extremamente maleável e dúctil; já se conseguiram lâminas de 000025 mm de espessura.\n"
                + "Conduz melhor calor e eletricidade do que o cobre. Exposta ao ar não se altera, exceto quando ele contém gás sulfídrico.\n"
                + "A prata metálica é muito usada nas moedas e para a fabricação de baixelas e adornos. Quando pura é demasiado mole para fins e emprega-se em\n"
                + "liga com outros metais, como o cobre. Diversos compostos de prata são utilizados em fotografia, em medicina, na preparação de tinta de marcar e\n"
                + "em laboratório. Emprega-se também a prata na galvanoplastia e na fabricação de espelhos.");
        Distribuicao("2", "8", "18", "18", "1", "--", "--");
    }

    public void Cadmio() {
        setTitle("Cádmio");//48
        jtfMassa.setText("112,411");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadmio.jpg")));
        jtaDescricao.setText("Metal de transição, que ocupa, juntamente com o zinco e o mercúrio, o grupo 2B da tabela periódica. Foi descoberto em 1817 por Friedrich\n"
                + "Stroemeyer. O cádmio é estraído da blend, onde se encontra como sulfeto de cádmio. A separação do zinco pode ser feita por meio de destilação,\n"
                + "ou precipitação. O cádmio é um metal mole, branco acinzentado. É bom condutor de calor e eletricidade. Funde a 321ºC e entra em ebulição a\n"
                + "770ºC. Não reage com o oxigênio do ar à temperatura ambiente, mas forma óxido quando acquecido. Também não é atacado pela água, mas reage\n"
                + "com seu vapor quando aquecido ao rubro. É usado na fabricação de equipamentos elétricos, em baterias alcalinas cádmio/níquel e em reatores\n"
                + "atômicos. Seu principal uso é como agente protetor contra a corrosão, sendo depositado eletroliticamente sobre certas partes de aviões,\n"
                + "automóveis etc");
        Distribuicao("2", "8", "18", "18", "2", "--", "--");
    }

    public void Indio() {
        setTitle("Índio");//49
        jtfMassa.setText("114,818");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/indio.jpg")));
        jtaDescricao.setText("Sua semelhaça com o alumínio e o gálio não superam a similaridade com o zinco.  Mesmo assim, é maleável e possui ponto de ebulição relativamente\n"
                + "baixo em comparação com outros metais. Apresenta coloração branco-prateada quando metálico puro, e emite um som característico quando é\n"
                + "dobrado. É sólido nas condições ambiente, porém seu ponto de fusão é baixo para um metal 157°C, assim, é facilmente fundível. O valor do ponto\n"
                + "de fusão é próximo de 2080°C. É um bom condutor de eletricidade e calor. Praticamente inexistente sob forma elementar na natureza, geralmente\n"
                + "associa-se a minérios de outros elementos como o ferro, chumbo, cobre, estanho e, principalmente, o zinco – sendo obtido como produto\n"
                + "secundário. É dito que até 1924 havia apenas 1 grama dessa substância isolada no planeta.\n"
                + "As aplicações mais sólidas do índio se concentram na fabricação de telas de LCD e ligas com baixo ponto de fusão.\n"
                + "Embora haja suspeitas de que o índio possa causar malefícios aos seres humanos, sua toxicidade é considerada baixa. Até porque, trabalhadores\n"
                + "da indústria de semicondutores e em soldas não apresentam efeitos colaterais noticiáveis, mesmo apresentando alta exposição com o metal.");
        Distribuicao("2", "8", "18", "18", "3", "--", "--");
    }

    public void Estanho() {
        setTitle("Estanho");
        jtfMassa.setText("118,71");//50
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estanho.jpg")));
        jtaDescricao.setText("Elemento químico metálico. Ligas contendo estanho já eram conhecidas antes de 3000 a.C., mas náo se sabe quando o metal foi isolado pela primeira\n"
                + "vez. As civilizações pré-colombianas da América usavam-no na fabricação de bronzes e em peças que serviam de moeda. Todos os depósitos\n"
                + "importantes de estanho contêm a cassiterita. O minério é encontrado e calcinado, eliminando as impurezas de enxofre e arsênio.\n"
                + "É um metal relativamente mole, dúctil, de cor branca. Seu ponto de fusão é de 231,9ºC e e ebulição 2.279ºC. Abaixo de 13ºC transforma-se em pó\n"
                + "negro não-cristalizado. Possui 10 isótopos naturais e 17 artificiais, sendo estes todos radioativos.\n"
                + "Cerca de 99% do estanho produzido são empregados de forma metálica. Além de seu, largo emprego em ligas como bronze, soldas, peltre e metal\n"
                + "de Babbit, é usado ainda como revestimento de lâminas de ferro ou aço, conhecidas como folhas-de-flandres. A camada protetora é aplicada pela\n"
                + "imersão da chapa em estanho fundido ou pela eletrólise de uma solução ácida ou alcalina de um sal de estanho, método que permite camadas\n"
                + "extremamente delgada e contínuas.");
        Distribuicao("2", "8", "18", "18", "4", "--", "--");

    }

    public void Antimonio() {
        setTitle("Antimônio");//51
        jtfMassa.setText("121,76");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/antimonio.jpg")));
        jtaDescricao.setText("É conhecido a muito tempo, foi usado na antiguidade como medicamento e nos pés para toalete feminina. O antímônnio em estado nativo é raro\n"
                + "Encontra-se no Brasil, no Méxicoe na Suíça. O antimônio puro é obtido a partir da estibina, cuja ocorrência se dá sempre ao lado de impurezas,\n"
                + "como o quartzo, calcário e etc., que precisam ser eliminados. A separação se da por fusão de massa; a estibina é separada pro ter ponto de fusão\n"
                + "muito baixo, em torno de 550ºC.\n"
                + "Quando bruto, o antimônio tem cor acinzentada e intenso brilho metálico, porém escurece quando pulverizado. Apresenta boas características de\n"
                + "de condutibilidade térmica e elétricas e, quando polido, apresenta-se com aparência de prata. Funde-se a 630ºC e quando triturado reduz-se\n"
                + "facilmente a pó. Mantém-se inalterável no ar. Aquecido em presença de oxigênio seco queima.\n"
                + "Alguns compostos de antimônio são empregados na formulação de fármacos.Porém, nem todos são inofensivos para a saúde humana: é dito que\n"
                + "sua toxicidade depende diretamente da forma pela qual o antimônio se apresenta.");
        Distribuicao("2", "8", "18", "18", "5", "--", "--");
    }
    
    public void Telurio(){
        setTitle("Telúrio");//52
        jtfMassa.setText("127,6");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telurio.jpg")));
        jtaDescricao.setText(" Há algum tempo era considerado um semi-metal ou metalóide, entretanto, como não há total consenso sobre a determinação de um elemento como\n"
                + "metal ou ametal por parte das organizações responsáveis dota, dos metalóides, apenas o germânio, antimônio e polônio como metais. Assim, o telúrio\n"
                + "é, hoje, considerado ametal. Apresenta brilho natural e coloração cinza-prateado (quando puro). Porém, como é encontrado na natureza sob forma\n"
                + "de minérios de cobre, ouro e enxofre, geralmente não é possível perceber tais características sem purificá-los. Nas condições ambiente, o telúrio\n"
                + "encontra-se no estado de agregação sólido e, se cristalino e pulverizado, com coloração esbranquiçada. Não é bom condutor de calor, conduz 32\n"
                + "menso que o ferro ou 170 vezes menos que a prata. Seus pontos de fusão e ebulição são respectivamente aproximados em 450°C e 990°C.\n"
                + "O telúrio é pouco abundante na crosta terrestre  na maioria das vezes é encontrado na forma de minérios de ouro, cobre, chumbo, além da forma\n"
                + "de óxido. Praticamente todo o telúrio extraído é aplicado na indústria como componente de ligas metálicas:\n"
                + "É adicionado a ligas ferrosas ara melhorar suas propriedades mecânicas; unto ao chumbo e cobre, é aplicado em trabalhos de soldadura e em\n"
                + "equipamentos químicos; é utilizado como um dos componentes antidetonantes da gasolina; junto ao bismuto, é utilizado em dispositivos termoelétrico");
        Distribuicao("2", "8", "18", "18", "6", "--", "--");
    }

    public void Iodo() {
        setTitle("Iodo");//53
        jtfMassa.setText("126,90447");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iodo.jpg")));
        jtaDescricao.setText("Elemento químico da família dos alogÊnios, descoberto por B. Courotis em 1812. Em 1815 Gay-Lussac provou que se tratava de uma substância\n"
                + "simples, que foi batizado de iodo (do grego iodes, violeta). Não é encontrado livre na natureza. Aparece na água do mar, sob a forma de iodeto de\n"
                + "sódio, em pequenas quantidade. Ocorre em pequenas quantidades nos tecidos animais e vegetais, mas em abundância nas algas marinhas.\n"
                + "À temperatura ambiente, o iodo é um sólido negro ou violácio, de odor característico, ponto de fusão de 114ºC e ebulição 183ºC. Sublima-se com\n"
                + "facilidade à pressão normal. Possui diversos isótopos radioativos de massa compreendida entre 199 e 139.\n"
                + "Sais de iodo são usados em fotografias. Certos corantes, reagentes e produtos intermediários da indústria e do laboratório químicos são compostos\n"
                + "de iodo. Em solução alcoólica é utilizado como anti-séptico para ferimentos (arde muito). Diversos sais de iodo são ministrados no tratamento de\n"
                + "doenças como arteriosclerose, hipertensão arterial, síflies, actinomicose, enfisemas, bronquite crônica, algumas formas de artrite, e certas desordens\n"
                + "tireodianas. Em casos de dosagem exagerada ou alergia, podem provocar no paciente acne ou outras doenças de pele.");
        Distribuicao("2", "8", "18", "18", "7", "--", "--");
    }

    public void Xenonio() {//54
        setTitle("Xenônio");
        jtfMassa.setText("131,293");//131,3
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/xenonio.jpg")));
        jtaDescricao.setText("Foi descoberto em 1898 por William Ramsay e M. W. Travers. Aparece em pequeníssimas quantidasdes em gases naturais na atmosfera. Possui 9\n"
                + "isótopos naturais, dos quais o predominante é o de massa 132 e diversos isótopos radioativos. Seu pondo de ebulição é de -08,06°C e de\n"
                + "solidificação -112°C. Até 1862, quando Neil Barlett annciou a preparação do hexafluoreto de xenônio e platina XePtf6, acreditava-se que todos os\n"
                + "gases nobres fossem inertes. É usado para o enchimento de lâmpadas especiais tipo pisca-pisca, flash e outras.");
        Distribuicao("2", "8", "18", "18", "8", "--", "--");
    }

    public void Cesio() {
        setTitle("Césio");//55
        jtfMassa.setText("132,905");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cesio.jpg")));
        jtaDescricao.setText("Foi descoberto em 1860 por Kirchoff e Bunsen, sendo o primeiro elemento descoberto por espectroscopia, através da análise do espectro da água\n"
                + "mineral, seu nome tem origem do latin caeusius, que significa, céu azul em função tanto do metla quanto de seus compostos emitirem uma \n"
                + "luminosidade decoloração azul. Possui ponto de fusão de 28ºC e de ebulição de 670ºC. É um dos poucos metais que se pode considerar que seja\n"
                + "líquido à temperatura ambiente.\n"
                + "Em estado metálico deve ser armazedo em líquidos apolares ou em gases inertes devido sua alta reatividade. Reage com água, com liberação de\n"
                + "hidrogênio e promovendo ataque ao vidro, motivo, pelo qual é utilizado para a gravação deste.\n"
                + "É encontrado na natureza nos minerais pollucite e lepidolita, e obtido a partir do resíduo de purificação do lítio, suas reservas estão localizadas\n"
                + "principalmente no Canadá. É um metal extremamente tóxico e radioativo, emissor de raios alfa é utilizado em aparelhos de raio-X, capaza de\n"
                + "transformar energia luminosa em elétrica. Também é aplicado em relógios atômicos.");
        Distribuicao("2", "8", "18", "18", "8", "1", "--");
    }

    public void Bario() {
        setTitle("Bário");//56
        jtfMassa.setText("137,327");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bario.jpg")));
        jtaDescricao.setText("Foi descoberto por Scheele em 1774, e isolado por Davy en 1808. É um metal branco prateado, mais duro que o chumbo, que se oxida\n"
                + "rapidamente no ar úmido. Reage com água, produzindo o hidróxido e desprendendo hidrogênio; quiema no ar com chama brilhante, formando\n"
                + " o peróxdio de bário. Seus principais minérios são: a barita e a witherita. É produzido pela eletrólise do cloreto de barita. O metal puro é empregado\n"
                + "na fabricação de válvulas eletrônicas a vácuo e, em liga com o níquel, nos sistemas de ignição dos automóveis. Principais comopostos o hidróxido,\n"
                + "utilizado em química analítica; o peróxido, usado na produção de água oxigenada; o sulfato, utilizado como pigmento branco, e em radiologia como\n"
                + "meio contrastante; o nitrato usado em pirotecnia para a produção de luz verde.");
        Distribuicao("2", "8", "18", "18", "8", "2", "--");
    }

    public void Lantanio() {
        setTitle("Lantânio");//57
        jtfMassa.setText("138,90547");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lantanio.jpg")));
        jtaDescricao.setText("Metal de transição, é extraído principalmente da monazita, onde está presente na forma de fosfato. É purificado por eletrólise do cloreto de lantânio\n"
                + "fundido. Fisicamente, apresenta-se como um metal branco, prateado, bom condutor de calor e de eletricidade. Sues principais compostos são:\n"
                + " o hidróxido de lantânio; o sesquióxido de lantânio. e o nitreto de lantânio. Seu ponto de fusão é de 920ºC e de ebulição é de 3460ºC. É um metal\n"
                + "de propriedades moderadamente tóxicas, porém é utilizado em muitos segmentos industriais com diversas finalidades. Em função de sua reatividade\n"
                + "o lantânio é utilizado como catalisador no craqueamento do petróleo. Como componente absorvente de infravermelho na manufatura de vidros\n"
                + "especiais e ópticos em forma , fabricação de pedras de isqueiro, artefatos de iluminação para projetores cinematográficos, eletrodos de baterias e\n"
                + "eletrodos catódicos em função da sua alta emissão de elétrons.  É adicionado ao aço no processo de fabricação, para aumento da resistência\n"
                + "mecânica.");
        Distribuicao("2", "8", "18", "18", "9", "2", "--");
    }

    public void Cerio() {
        setTitle("Cério");//58
        jtfMassa.setText("140,116");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cerio.jpg")));
        jtaDescricao.setText("Metal de transição interna pertencente a série dos lantanídes, é um metal maleável, dúctil e resistente, é sólido a temperatura ambiente\n"
                + "possui coloração semelhante a do aço sendo branco acinzentado levemente prateado. Foi descoberto no ano de 1803 por Berzélius e Hisingar na\n"
                + "Suécia e de maneira idependente na Alemanha pelo químico Klaproth. Seu nome vem do asteróide Ceres, descoberto dois anos antes do cério, por\n"
                + "Piazzi. É um metal reativo, logo que exposto ao ar úmido vemos a perca de seu brilho metálico e aparecimento de manchas, em seguida é recoberto\n"
                + "por uma camada amarelo esverdeada. Queima espontaneamente em contato com ar atmosférico, quando em pó ou se o metal sólido for arranhado\n"
                + "com um objeto qualquer. Forma diversos compostos químicos.\n"
                + "O cério é um dos lantanídeos mais abundantes que se conhece, porém possui usos semelhantes aos demais lantanídeos, como: ligas metálicas,\n"
                + "fabricação de equipamentos de iluminação cinematográfica e seu óxido é usado como catalisador em escapamento de automóvies.\n"
                + "Sua obtenção industrial é através da eletrólise do cloreto ou por redução do fluoreto fundido com cálcio. ");
        Distribuicao("2", "8", "18", "19", "9", "2", "--");
    }
    
    public void Praseodimio(){
        setTitle("Praseodímio");//59
        jtfMassa.setText("140,90765");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/praseodimio.jpg")));
        jtaDescricao.setText("É um metal maleável, prateado e muito dúctil. Oxida-se quando exposto ao ar, combrindo-se de uma fina camada esverdeada. Deve ser, por isso\n"
                + "protegido da luz e guardado em hidrocarbonetos líquidos de petróleo. Funde-se a 931ºC. Tem emprego na indústria cinematográfica como núcleos\n"
                + "de arco de carbono usado para a iluminação dos estúdios e para a projeção de filmes, Seus sais, de cor verde-amarelado, usam-se no fabrico de\n"
                + "vidros e de esmaltes. o óxido, amarelo, posto nos óculos dos soldadores, protege os olhos contra a intensidade da luz branca.\n"
                + "Foi o austríaco Karl Auer, quem descobriu o praseodímio, em 1885.");
        Distribuicao("2", "8", "18", "21", "8", "2", "--");
    }

    public void Neodimio() {
        setTitle("Neodímio");//60
        jtfMassa.setText("144,242");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neodimio.jpg")));
        jtaDescricao.setText("É um metal que possui propriedades semelhantes a do praseodímio, como o qual ele é comumente encontrado e até mesmo foi confundido no\n"
                + "passado em virtude de estarem presentes no didimio, que é um mineral encontrado na bastinazita e monazita. Minerais estes que são responsávies\n"
                + "não somente pela presença do neodímio, mas da maior parte dos lantanídeos. É um metal branco prateado levemente acinzentado, é maleável e dúctil\n"
                + "além de resistente a ação de agentes químicos quando este está presente em ligas metálicas. Somente no ano de 1885 o químico austríaco Weslbach,\n"
                + "após observar que os sais do didímio da lantania apresentavam cores diferentes  descobriu o praseodímio e evidentemente o neodímio.  O nome\n"
                + "do elemento é originado das palavras gregas “neos” que significa novo e “dimyos” que significa gêmeos em função de apresentar características\n"
                + "próximas a do neodímio e estarem juntos em um mesmo minério.\n"
                + "O neodímio é um metal relativamente reativo, deve ser guardado em recipiente fechado em virtude de reagir com o oxigênio vigorosamente. Logo\n"
                + "que exposto ao ar reage com o oxigênio formando óxido de neodímio.\n"
                + "Alguns dos usos mais importantes do neodímio são: na indústria cinematográfica como componentes de luzes; na fabricação de laser para cortes\n"
                + "precisos e na fabricação de lentes usadas na astronomia; como pigmento para a coloração de vidros entre outras.");
        Distribuicao("2", "8", "18", "22", "8", "2", "--");
    }
    
    public void Promecio(){
        setTitle("Promécio");//61
        jtfMassa.setText("145");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/promecio.jpg")));
        jtaDescricao.setText("Elemento químico radioativo, do grupo das chamadas terras raras. Sua existência de que se suspeitava, foi confirmada em 1914 por Henry Gwyn\n"
                + "Jeffreys Mosley, o jovem físico inglês, que morreria três anos mais tarde a batalha da baía de Suvla. Em 1914 na universidade do estado Ohio, em\n"
                + "Columbus, o bombardeio do neodímio e do praseodímio com partículas alfa, produziu elemento radioativo que tinhas as características do novo\n"
                + "elemento. Em 1942, o italiano Emilio Segrè e o alemão Albrecht Bethe, cientístas radicados nos EUA, confirmaram a obtenção do promécio. Só em\n"
                + "1945, no entanto, foi identificado quimicamente pela cromatografia.\n"
                + "Elemento sintético, suas propriedades são ainda pouco conhecidas; nunca foi encontrado em estado livre na natureza e não se acredita que faça parte\n"
                + "da crosta terrestre.");
        Distribuicao("2", "8", "18", "23", "8", "2", "--");
    }

    public void Samario(){
        setTitle("Samário");//62
        jtfMassa.setText("150,36");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/samario.jpg")));
        jtaDescricao.setText("O samário é um metal branco prateado que apresenta um brilho característico, é estável quando exposto ao ar da atmosfera é maleável e dúctil e\n"
                + "relativamente mole. Faz parte dos metais de transição externa pertence ao grupo dos lantanídeos. Foi descoberto no ano de 1879 pelo químico\n"
                + "francês Paul-Émile Lecoq  de Boisbaudran que isolou o metal do mineral samarsquita, após ter sido observado  através de espectroscopia pelo\n"
                + "químico suíço, Marignac no didimio. Recebeu este nome em homenagem ao coronel russo Samarsk.\n"
                + "O samário é um metal medianamente reativo, visto que é necessário que ocorra aumento de sua temperatura para observar as reações do metal.\n"
                + "Quando o elemento atinge uma temperatura de 150ºC, ele reage vigorosamente com o oxigênio do ar formando óxido de samário, reage com ácidos\n"
                + "fortes concentrados ou diluídos. Além dos sais o samário forma nitretos, hidretos e alguns outros compostos menos comuns.\n"
                + "O samário não ocorre na natureza em sua forma elementar sendo encontrado comumente na monazita e bastnazita O samário não ocorre na natureza\n"
                + "em sua forma elementar sendo encontrado comumente na monazita e bastnazita na forma de samasrkita mineral do qual ele foi isolado e é obtido\n"
                + "industrialmente. O óxido de samário é utilizado na fabricação de vidros capazes de absorver a luz infravermelha, na dopagem de cristais de fluoreto\n"
                + "de cálcio para produção de lasers ópticos e comuns; a liga de samário com o cobalto é um potente imã.");
        Distribuicao("2", "8", "18", "24", "8", "2", "--");
    }
    
    public void Europio() {
        setTitle("Európio");//63
        jtfMassa.setText("151,964");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/europio.jpg")));
        jtaDescricao.setText("Metal cinza-prateado, dúctil e quase tão duro quanto o ferro. É o maior reativo das terras-raras, oxidando-se rapidamente quando exposto ao ar.\n"
                + "Foi descoberto por Eugen Antole Demarcy, que o separou do seu óxido em uma forma relativamente pura em 1901. É um metal muito difícil de ser\n"
                + "preparado tanto que só foi obtido na forma verdadeiramente pura recentemente. A escassez e a química complexa do európio foram provavelmente\n"
                + "as causas da sua descoberta tardia, mais de quinze anos depois do isolamento do samário. O nome, claro, deriva da palavra Europa.");
        Distribuicao("2", "8", "18", "25", "8", "2", "--");
    }

    public void Gadolinio() {
        setTitle("Gadolínio");//64
        jtfMassa.setText("157,25");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/gadolinio.jpg")));
        jtaDescricao.setText("É um metal branco prateado, é mole e flexível, em contato como o ar úmido observa-se o aparecimento de mancha, provavelmente a mancha de\n"
                + "origem dos compostos formados em sua superfície em função da reação com elementos presentes no ar. O gadolinio deve ser armazenado ao abrigo\n"
                + "da umidade e do ar. oi descoberto de maneira independente pelos cientistas Boisbaldran e Marignac em 1880 e por Monsander que o isolou do\n"
                + "minério de ítrio em 1886. O gadolínio recebeu este nome em homenagem ao químico finlandês Johan Gadolin (1760-1852), que descobriu o ítrio em\n"
                + "1792. O gadolínio é um metal reativo que quando exposto ao ar úmido, reage com o oxigênio formando óxidos, que se desprende facilmente da\n"
                + "superfície do metal. Quando submetido a temperaturas acima de 1200ºC ocorre a mudança de sua estrutura cristalina. Na natureza o metal não\n"
                + "ocorre em seu estado elementar sendo encontrado na forma de minérios.\n"
                + "O sulfato de gadolínio é utilizado na fabricação de amplificadores de som, CDs e memórias de computador.");
        Distribuicao("2", "18", "25", "9", "2", "--", "--");
    }
    
    public void Terbio(){
        setTitle("Térbio");//65
        jtfMassa.setText("158,92535");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/terbio.jpg")));
        jtaDescricao.setText("O térbio é um metal de transição interna, branco prateado levemente acinzentado, pertencente aos lantanídeos. É um metal macio, mole e flexível que\n"
                + "acilmente cortado com uma faca afiada. Foi descoberto no ano de 1943 por Monsander, no minério de ítrio juntamente com o érbio cujo, as\n"
                + "impurezas restantes da purificação do érbio em 1942, continham o térbio, o metal foi nomeado em homenagem a cidade de Ytterby na Suécia.\n"
                + "O térbio é um metal medianamente reativo, é estável em contato com o ar em temperatura ambiente. Em temperaturas superiores a 1200º C ocorre\n"
                + "uma mudança na estrutura cristalina do metal. O térbio reage com ácidos concentrados ou diluídos, com água e oxigênio, formando diversos\n"
                + "compostos. O térbio é obtido através da reação da reação de seu fluoreto com cálcio sob alta temperatura usando o tântalo como catalisador. Ocorre\n"
                + "em minérios como cerite, gadolinita, na monazita. A utilização do térbio é bastante peculiar, entre seus usos podem ser enunciados os seguintes:\n"
                + "Os sais, óxido e hidróxido de térbio juntamente com o fósforo são utilizados na fabricação de tubos de imagem de televisores; na dopagem de\n"
                + "de dispositivos para computadores e na fabricação de lasers, fabricação de equipamentos refratários, revestimento para reatores nucleares, com o\n"
                + "borato de sódio é utilizado em dispositivos de estado sólido.");
        Distribuicao("2", "8", "18", "28", "8", "2", "--");
    }

    public void Diprosio() {
        setTitle("Diprósio");//66
        jtfMassa.setText("162,5");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/diprosio.jpg")));
        jtaDescricao.setText("Elemento metálico descoberto em 1886 por Lecoq de Boisbaudran, que obteve um de seus compostos a partir de um óxido de hólmio e batizou de\n"
                + "disprósio a partir da palavra grega dysprosidus, que significa “difícil de atingir”. Nem o óxido nem o metal eram disponíveis com purezas adequadas\n"
                + "até o desenvolvimento de métodos de separação por troca iônica e redução metalográfica por Spedding, e colaboradores, em meados do século XX. \n"
                + "É pertencente pertencente ao grupo dos lantanídeos e com interesse apenas científico. Sues compostos são muito abundantes na Noruega EUA,\n"
                + "Brasil, Índia e Austrália. O disprósio existe normalmente em como um óxido branco chamado disprósia, junto com o érbio , o hólmio e outrosn\n"
                + "elementos do grupo dos lantanídeos.  A disprósia, é usada às vezes nas varas de controles dos reatores nucleares. O disprósio tem um ponto de\n"
                + "fusão de 1.412ºC");
        Distribuicao("2", "8", "18", "28", "8", "2", "--");
    }

    public void Holmio() {
        setTitle("Hólmio");//67
        jtfMassa.setText("164,93032");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/holmio.jpg")));
        jtaDescricao.setText("O hólmio é um elemento de transição interna pertencente ao grupo dos lantanídeos. É um metal branco prateado brilhante, é relativamente macio,\n"
                + "mole e flexível. A descoberta do hólmio iniciou-se através dos químicos suíços Delafontaine e Soret, quando eles observaram detalhes diferentes na\n"
                + "banda de absorção de outros metais, suspeitando assim tratar-se de um elemento “X”, que se encontrava na amostra que eles estavam analisando em\n"
                + "1978. De maneira independente o cientista sueco Cleve descobriu o metal durante sua pesquisa com a érbia, a comprovação de que realmente\n"
                + "tratava-se de um novo elemento veio em 1911 quando Homberg preparou o óxido de hólmio, que é um composto amarelo intenso.\n"
                + "O elemento recebeu esse nome em homenagem à cidade de Cleve, Hólmia na Suécia,  palavra latina de onde também deriva o nome Estocolmo,\n"
                + "capital sueca. Seu ponto de fusão é de 1460ºC e de ebulição 2720ºC.");
        Distribuicao("2", "8", "18", "29", "8", "2", "--");
    }

    public void Erbio() {
        setTitle("Érbio");//68
        jtfMassa.setText("167,259");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erbio.jpg")));
        jtaDescricao.setText("Elemento metálico pertencente ao grupo dos lantanídeos. Foi descoberto por Mosander, em 1842, o óxido desse metal, todavia,  só em 1905 foi\n"
                + "separado puro, e o metal, apenas em 1934, pela redução do tricloreto de érbio anidro com vapor de postássio. É encontrado nos minérios fergusonita\n"
                + "xenotima, policrásio e blanstradina.\n"
                + "De brilho metálico, colorido prateado escuro, mole e maleável, o érbio não reage rapidamente quando exposto ao ar, como outras terras-raras. É \n"
                + "utilizado para fins metalúrgicos: diminui a dureza do vanádio, quando a ele adicionado, facilitando sua aplicabilidade. O óxido de érbio é usado\n"
                + "como corante róseo em vidros e em eamaltes para porcelanas.\n"
                + "O nome érbio origina-se do topônimo sueco Ytt(erby), povoado onde se descobriu o minério que contém o metal. Seus seis isótopos naturais, todos\n"
                + "estáveis, têm suas massas atômicas compreendidas entre 162 e 170. Seu ponde de fusão fica entre 1.475ºC e 1.525ºC, e entra em ebulição a 2.600ºC.");
        Distribuicao("2", "8", "18", "30", "8", "2", "--");
    }

    public void Tulio(){
        setTitle("Túlio");//69
        jtfMassa.setText("168,93421");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tulio.jpg")));
        jtaDescricao.setText("Elemento de cor cinza-prateado e maleável, é encontrado em minérios como a monazita. Usado em aparelhos de raios X. Apresenta uma certa\n"
                + "resistência a corrosão quando no ar seco. O túlio natural é composto inteiramente de um único isótopo estável.  O túlio foi usado para produzir lasers\n"
                + "porém os custos de produção elevados impediram que outros usos comerciais para o túlio fossem desenvolvidos.  O elemento túlio foi descoberto\n"
                + "pelo químico sueco Per Teodor Cleve em 1879 procurando impurezas nos óxidos de outros elementos.");
        Distribuicao("2", "8", "18", "31", "8", "2", "--");
    }
    
    public void Iterbio() {
        setTitle("Itérbio");//70
        jtfMassa.setText("173,054");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iterbio.jpg")));
        jtaDescricao.setText("Elemento químcio da família dos lantanídeos. Descoberto em 1878 pelo químcio suíço Marignac, somente depois de 1953 foi possível determinar\n"
                + "todas as suas propriedades, graças à sua separação pura. Ocorre entre outros minérios na xenotima, na gadolinita, na blastrandina e no policrásio\n"
                + "Metal prateada brilhoso, molee, dúctil e maleável, é estável, devendo, no entanto, ser isolado do ar e da umidade, pois reage lentamente. É\n"
                + "minimamente  tóxico. Tem sete isótopos estáveis de massas compreendidas entre 168 e 176, sendo o mais abundante o itérbio 171 e o 174.\n"
                + "Conhece-se sete redioativos, como o número de massas entre 161 e 177. Ponto de fusão 824ºc e de ebulição 1427ºC. Sua adição ao aço inoxidável,\n"
                + "em ínfimas quantidades, proporciona maior resistência e maior refinamento.");
        Distribuicao("2", "8", "18", "31", "8", "2", "--");
    }

    public void Lutecio() {
        setTitle("Lutécio");//71
        jtfMassa.setText("174,9668");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lutecio.jpg")));
        jtaDescricao.setText("Elemento químcio que tem seu ponto de fusão em 1652ºC e de ebulição em 3327ºC, separado da terra itérbia em 1907 pelo químico frnacês Urbain.\n"
                + "Só em 1950 foi separado o metal puro, desde quando quase todas as suas propriedades passaram a ser conhecidas. Suas maiores ocorrências \n"
                + "verificam-se nos minérios de itérbio e ítrio. Seu nome deriva de Lutetia, denominação latina da cidadde de Paris. É um metal brilhoso, branco\n"
                + "prateado e pouco atacado pela umidade e pelo ar atmosférico. Conhecem-se apenas algumas de suas aplicações.");
        Distribuicao("2", "8", "18", "32", "9", "2", "--");
    }

    public void Hafnio() {
        setTitle("Háfnio");//72
        jtfMassa.setText("178,49");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/hafnio.jpg")));
        jtaDescricao.setText("O háfnio é um metal prateado brilhante, dúctil, suas propriedades são influenciadas por impurezas de zircônio, é resistente a corrosão e tem\n"
                + "excelentes propriedades mecânicas. A descoberta do háfnio se deu em 1913. Quando Moseley teve acesso às técnicas dos métodos de raios X, uma\n"
                + "série de elementos tornou-se evidente. Numa pesquisa, ficou evidente a presença de um elemento desconhecido, de número 72, entre o elemento do\n"
                + "grupo dos lantanídeos ou terras-raras lutécio (71) e o elemento tântalo (73). O elemento 72 possuía propriedades diferentes dos outros membros,\n"
                + "não podendo ser considerado como um metal lantanídeo.\n"
                + "Dirk Coster e George Charles von Hevesy pesquisaram os minerais de zircônio a fim de identificar o elemento desconhecido (72) e, em 1923,\n"
                + "anunciaram sua presença, evidenciada pelo espectro de raios X. Chamaram o metal de Hafnium (Háfnio), em homenagem  à Copenhaguem, chamada\n"
                + "de “hafnia” na época dos Romanos. Seu ponto de fusão é de 2222ºC e de ebulição 5400ºC.");
        Distribuicao("2", "8", "18", "32", "10", "2", "--");
    }
    
    public void Tantalo(){
        setTitle("Tântalo");//73
        jtfMassa.setText("180,94788");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tantalo.jpg")));
        jtaDescricao.setText("Foi descoberto em 1802 por A.G. Ekeberg em minerais encontrados na Finlândia e Suécia. Encontrado quase sempre misturado com o nióbio e, as\n"
                + "vezes com estanho, titânio, tungstênio, manganês e germânio. É obtido mediante ao aquecimento de fluoreto de tântalo. Os maiores depósitos de\n"
                + "tântalo estão localizados no Congo, Austrália, EUA, Brasil e Escandinávia.\n"
                + "Metal azulado, extremamente dúctil, maleável, forte e resistente; ponto de fusão 2996ºC; ponto de ebulição 4100ºC. Destaca-se por sua resistência\n"
                + "a ação de ácidos, de produtos químicos corrosivos, sendo entretanto dissolvido por uma mistura de ácido nítrico e hidrofluorídrico. É um dos\n"
                + "poucos metais que se inflamam qundo aqeuecidos ao ar.\n"
                + "Usa-se o tântalo em reatores atômicos, motores de aviões a jato, foguetes, tubos eletrônicos, trocadores de calor, evaporadores, condensadores,\n"
                + "filamento de lâmpadas elétricas. Devido à reduzida reação de rejeição que provoca ao ser enxertado no organismo humano, vem sendo usado na\n"
                + "cirurgia dos ossos e dos nervos.");
        Distribuicao("2", "8", "18", "32-", "11", "2", "--");
    }

    public void Tungstenio(){
        setTitle("Tungstênio");//74
        jtfMassa.setText("183,84");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tungstenio.jpg")));
        jtaDescricao.setText("O Tungstênio, conhecido por ser utilizado na fabricação do filamento de lâmpadas incandescentes, é um metal de transição externa muito resistente\n"
                + "à corrosão.  É sólido, apresenta coloração branco-acizentado e brilhante nas condições ambiente e, é o elemento com o maior ponto de fusão e de\n"
                + "ebulição. Respectivamente, 3422°C e 5657°C. Quando exposto ao ar sofre oxidação, entretanto, por causa do óxido formado é considerado muito\n"
                + "resistente à corrosão. Assim como, só é atacado ligeiramente por ácidos minerais diluídos. Os minérios fornecedores de tungstênio mais importantes\n"
                + "são a wolframita e a scheelite. Cerca de 75% das reservas mundiais encontram-se na China  mas também são grandes produtores a Rússia, Áustria\n"
                + "e Portugal. O Tungstênio é tão raro quanto o Molibdênio e, a depender da região de exploração, os dois metais podem estar juntos num mesmo\n"
                + "minério.");
        Distribuicao("2", "8", "18", "32", "12", "2", "--");
    }
    
    public void Renio (){
        setTitle("Rênio");//75
        jtfMassa.setText("186,207");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/renio.jpg")));
        jtaDescricao.setText("O rênio é um elemento químico metálico semelhante ao manganês. Em 1925, os químicos Walter Noddack, Tacke e Berg, anunciaram a descoberta\n"
                + "de dois novos elementos, semelhantes ao manganês. Trabalharam em amostras dos minérios columbita e dos minérios de platina separaram todos os\n"
                + "componentes desses minerais isolando assim uma amostra ainda desconhecida, a qual foi submetida a analises de raios-X, e descobrindo-se que se\n"
                + "tratava dos elementos de numero atômico 75 e 43, dano o nome do elemento 75 de renio. Atualmente a principal fonte de extração do rênio é a\n"
                + "molibdenite, mas também pode ser encontrada em alguns minérios de cobre e platina.\n"
                + "Apesar do custo elevado há sim aplicações para o rênio.");
        Distribuicao("2", "8", "18", "32", "13", "2", "--");
    }
    
    public void Osmio() {
        setTitle("Ósmio");//76
        jtfMassa.setText("190,23");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/osmio.jpg")));
        jtaDescricao.setText("É um metal muito duro e um dos mais densos de todos; inatacável pelos ácidos, é fafcilmente oxidado, e o óxido é usado como agente oxidante em\n"
                + "química orgânica e como ligas, emprega-se na fabricação de pontas de canetas e de contatos elétricos. Foi descoberto no início do século XIX pelo\n"
                + "químico. É um metal azul acinzentado e muito difícil de ser trabalhado, mesmo em altas temperaturas. Tennant descobriu o elemento junto como o\n"
                + "irídio em resíduos de minério de platina não dissolvidos por água-régia. Seu ponto de fusão está em torno dos 3000ºC e o de ebulição 5000ºC.");
        Distribuicao("2", "8", "18", "32", "14", "2", "--");
    }

    public void Iridio() {
        setTitle("Irídio");//77
        jtfMassa.setText("192,217");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iridio.jpg")));
        jtaDescricao.setText("Descoberto em 1803 por Smithson Tennant, nos resíduos deixados pela dissolução do minério da platina, sua produção mundial fica em torno de\n"
                + "155Kg/ano. É recuperado como subproduto da indústria de mineração do níquel.\n"
                + "Metal branco duro e frágil, só é menos denso que o ósmio. Oxida-se no ar a 800ºC. É o metal mais resistente á corrosão de que se tem notícia.\n"
                + "Aquecido a autas temperaturas é atacado pelo flúor. Ponto de fusão 2424ºc e de ebulição 5300ºC.");
        Distribuicao("2", "8", "18", "32", "15", "2", "--");
    }

    public void Platina() {
        setTitle("Platina");//78
        jtfMassa.setText("195,084");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/platina.jpg")));
        jtaDescricao.setText("Metal branco acinzentado, dotado de brilho, mais duro que o cobre, a prata e o ouro, dúctil e maleável. Funde-se entre 1750 e 1755ºC. É atacado\n"
                + "pelos álcalis, nitrato e cianetos; não é pelo ar nem pelo oxigÊnio, em temperatura normal, nem pelos ácidos. A água-régia a dissolve, com formação\n"
                + "de tetracloreto de platina. Forma ligas duras e elásticas  com vários metais. Foi descoberta em 1819, nos montes Urais, na Rússia. Sues principais\n"
                + "usos são na joalheria, 40%, e nas indústrias: químicas, 25% elétrica, 15% e outras, 20%.");
        Distribuicao("2", "8", "18", "32", "17", "1", "--");
    }

    public void Ouro() {
        setTitle("Ouro");//79
        jtfMassa.setText("196,966569");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ouro.jpg")));
        jtaDescricao.setText("É um ótimo condutor de eletricidade e calor, porém por inviabilidade econômica é praticamente inutilizado para esses fins. É o metal mais dúctil\n"
                + "e maleável conhecido: cerca de 1 grama de ouro pode ser laminado em até 1 metroquadrado. Por isso utilizam-se outros metais, como a prata e o\n"
                + "cobre, para que sua tenacidade aumente e a liga seja mais resistente que o ouro puro. Em estado natural e em condições ambiente, o ouro é sólido\n"
                + "e apresenta coloração amarela metálica com muito brilho. Por ser um metal nobre, o Ouro é pouco reativo e seus principais compostos são: óxidos,\n"
                + "o tricloreto e o ácido cloroáurico. O Ouro está presente em toda a parte da natureza, porém em concentrações ínfimas. Como exemplo, estão as\n"
                + "águas do mar que contém cerca de 1 Kg de outro a cada 8,3 bilhões de litros, u ainda, na crosta terrestre onde a concentração é de cerca de 1 Kg\n"
                + "do metal a cada 200 000 toneladas de massa sólida (litosfera). As grandes minas possuem concentração de 1 Kg a cada 334 toneladas. Por ser tão\n"
                + "raro, o ouro possui um grande valor comercial.\n"
                + "O ouro é amplamente utilizado na confecção de jóias (anéis, relógios, colares), medalhas, circuitos eletrônicos, moedas e até é submetido à\n"
                + "modificações químicas par ser comestível. Para a determinação da pureza de uma liga de ouro, basta dividir sua classificação em quilates por 24\n"
                + "e multiplicar por 100, ou seja, um anel de 10 g de liga com 12 quilates possui 50% de sua massa constituída por Ouro (5 g).");
        Distribuicao("2", "8", "18", "32", "18", "1", "--");
    }

    public void Mercurio() {
        setTitle("Mercúrio");//80
        jtfMassa.setText("200,59");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/mercurio.jpg")));
        jtaDescricao.setText("Único elemento químico metálico qeu é líquido a temperaturaas normais. O mercúrio é conhecido, provavelmente, pelo menos desde 1500 a.C. Foi\n"
                + "um dos primeiros elementos estudados e tem sido de interesse para todos os estudantes de química desde os dias da alguimia até a atualidade. Já\n"
                + "muito antes da era cristâ, os chineses usavam compostos contendo mercúrio na formação de tintas e pinturas.\n"
                + "Praticamente todo o mercúrio é obtido a partir do cinábrio, mineral vermelho e brilhante. Também é encotrado em estado nativo, porém em\n"
                + "pequenas quantidades. As mais famosas minas produtoras de mercúrio do mundo são as de Almadén, na Espanha.\n"
                + "Os depósitos de mercúrio são de origem relativamente recente, mas aparecem em rochas de todas as idades. O mais importante de todos os usos\n"
                + "modernos do mercúrio é a fabricação de instrumentos de laboratório. Pssui outras aplicações importantes em termômetros, barômetros,\n"
                + "instrumentos para medir pressão do sangue. e como catalisador (células de mercúrio para soda eletrolítica; em energia atômica).");
        Distribuicao("2", "8", "18", "32", "18", "2", "--");
    }

    public void Talio(){
        setTitle("Tálio");//81
        jtfMassa.setText("204,3833");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/talio.jpg")));
        jtaDescricao.setText("Foi descoberto por William Crooks, em 1861. O tálio o corre em pequenas quantidades na pirita, na blenda e na hematita, e em alguns em alguns\n"
                + "mineras raros, como a crookesita. O tálio é um metal cinza-azulado que escurece ao contato como o ar. Suas propriedades físicas assemelham-se às\n"
                + "do chumbo. Maleável e dúcil, corta-se facilmente com uma faca. Seu ponto de fusão é de 303,5ºC e de ebulição 1457ºC. O metal puro é dissolvido\n"
                + "pelos ácidos nítrico e sulfúrico, e menso facilmente pelo ácido clorídrico. Seus compostos são venenosos. O próprio metal se transforma nesses\n"
                + "compostos em contato com o ar úmido em contato com o ar e a pele. A intoxicação por tálio, que pode ser fatal, provoca distúrbios nervosos e\n"
                + "gastrintestinais e rápida perda de cabelo.");
        Distribuicao("2", "8", "18", "32", "18", "3", "--");
    }
    
    public void Chumbo() {
        setTitle("Chumbo");//82
        jtfMassa.setText("207,2");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/chumbo.jpg")));
        jtaDescricao.setText("Metal cinza azulado que possui, quando recentemente cortado, brilho metálico vivo. Seu símbolo é Pb pois vem do latim plumbum. Já era\n"
                + "conhecido eutilizado no antigo Egito. Encontra-se muitas vezes sitado no Velho Testamento. Sabe-se que os romanos o empregavam na fabricação\n"
                + "de manilhas, cosméticos e tintas. Foi estudado pelos alquimistas que o dedicaram a Saturno. Muitas vezes, ao longo da história, foi confundido com\n"
                + "o estanho.\n"
                + "Na natureza é ocasionalmente encontrado livre, em pequenas quantidades. Seus compostos minerais são mumerosos: a galena e a cerusita são so\n"
                + "mais abundantes e que têm maior aplicação industrial. Em virtude da facilidade com que pode ser trabalhado, e da resistÊncia química, tem sido\n"
                + "largamente empregado na fabricação de utensílios para várias aplicções.\n"
                + "Seu ponto de fusão é 327,4ºC e de ebulição 1.740ºC. É muito mole e maleável a frio, e pode ser riscado com a unha. Exposto ao ar, oxida-se,\n"
                + "formando uma fina camada de óxido que protege a superfície contra a própria oxidação. Reage facilmente com ácido nítrico, e muito dificilmente\n"
                + "com ácidos clorídricos e sulfúrico diluido a frio.");
        Distribuicao("2", "8", "18", "32", "18", "3", "--");
    }

    public void Bismuto() {
        setTitle("Bismuto");//83
        jtfMassa.setText("208,9804");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bismuto.jpg")));
        jtaDescricao.setText("J. H. Pott em 1739 foi o primeiro a demonstrar as características do bismuto e suas reações foram mais tarde estudadas por S. F. Geoffrey (1753)\n"
                + "e T. Bergman (1780). É encontrado em estado livre em muitas regiões da América, Europa e Ásia. Combinada com enxofre forma a bismutina;\n"
                + "e com oxigênio, a bismita ou ocre de bismuto. O bismuto é um sólido branco, avermelhado; é duro, quebradiço e brilhante. Cristaliza ficilmente e\n"
                + "se dilata quando solidifica, como a água ou o antimônio. De todos os metais é o mais diamagnético e o de menor condutibilidade térmica depois do\n"
                + "mercúrio.\n"
                + "Usa-se o bismuto na fabricação de ligas, particularmente as de metais fusíveis. Tais ligas são usadas pra tampas de segurança de caldeiras, válvulas\n"
                + "de alarme, fusíveis para instalações elétricas, alarmes de incêndio e outras aplicações.");
        Distribuicao("2", "8", "18", "32", "18", "5", "--");
    }

    public void Polonio() {
        setTitle("Polnio");//84
        jtfMassa.setText("209");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/polonio.jpg")));
        jtaDescricao.setText("Elemento radioativo descoberto por Madame Curie em 1898 no minério de urânio chamado pechblenda, possui cor cinzenta prateada ou negro, da\n"
                + "família do oxigênio. Como indica sua posição periódica, é mais eletropositivo do que o selênio e o telúrio e se assemelha ao bismuto. Trata-se de um\n"
                + "metal muito raro, ocorre na natureza como produto de decomposição radioativa do urânio, do tório e do actínio.\n"
                + "Isolado a partir de derivados da extração de rádio de minerais de urânio, o polônio pode ser produzido artificialmente. Por ser altamente radioativo\n"
                + "o polônio deve ser manipulado com extremo cuidado. É empregado para eliminar a eletricidade estática gerada pela laminação do papel, na\n"
                + "manufatura de laminados plásticos e na fiação de fibras sintéticas. Também é usado em escovas para remover poeira de filmes fotográficos e, em\n"
                + "física nuclear como fonte de radiação alfa. Misturas de polônio com berilo ou com outros elementos leves são empregadas como fontes de nêutrons.");
        Distribuicao("2", "8", "18", "32", "18", "6", "--");
    }

    public void Astato() {
        setTitle("Astato");//85
        jtfMassa.setText("210");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/astato.jpg")));
        jtaDescricao.setText("É derivado de sussecivas desintegrações de núcleos de urânio e tório, além de também ser radioativo. Apesar de ser comprovada a sua existência\n"
                + "poucas propriedades são conhecidas, pois é muito raro na crosta terrestre, sua síntese é de difícil rendimento e é extremamente instável. Como é\n"
                + "bastante escasso na natureza, seu radioisótopos podem ser sintetizados através do bombardeamento de átomos de bismuto com particulas alfa. Seu\n"
                + "ponto de fusão fica em torno de 300ºC e o de ebulição 340ºC. A aparência quando na temperatura ambiente e no formato mais estável, é metálica.\n"
                + "O astato é considerado o elemento mais raro já evidenciado. Acredita-se que em minérios de urânio e tório traços de astato que somem menos de\n"
                + "30g como reserva mundial. Ou seja, essa quantidade é tão irrisória que não apresenta mal algum para o homem. Hoje, ainda não se fala em\n"
                + "aplicações práticas para o astato, entretanto, no campo teórico pode servir de objeto de estudo em investigações científicas.");
        Distribuicao("2", "8", "18", "32", "18", "7", "--");
    }

    public void Radonio() {
        setTitle("Radônio");//86
        jtfMassa.setText("222");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/radonio.jpg")));
        jtaDescricao.setText("Foi descoberto em 1899 por R. B. Owens e E. Rutherford. Seus outros isótopos importantes sãoo torônio e o actinônio. O radônio\n"
                + "é produto imediato da desintegração do rádi, e sua semivida é de 3,825 dias. O radônio só é encontrado em presença de uma fonte de rádio.\n"
                + "Seu ponto de ebulição é de -62ºC e o de solidificação, -71ºC. Não é perfeitamente inierte, tendo sido preparado o fluoreto de radônio.\n"
                + "É utilizado em radioterapia e radiografia. Os elementos do grupo dos gases nobres são os menos reativos da tabela periódica.");
        Distribuicao("2", "8", "18", "32", "18", "8", "--");
    }

    public void Francio() {
        setTitle("Frâncio");//87
        jtfMassa.setText("223");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/francio.jpg")));
        jtaDescricao.setText("o fráncio é um metal alcalino. É o segundo elemento mais raro da Terra (atrás apenas do astato), altamente radioativo e instável. Portanto para\n"
                + "reunir uma quantidade considerável deste metal, é necessário sintetizá-lo em laboratório. Seu ponto de fusão é 27ºC e de ebulição 27ºC. Ou seja,\n"
                + "assim como o gálio e o césio, sofreria fusão se puséssemos na palma da mão. A condução de calor no frâncio dá-se de forma 5 vezes menos\n"
                + "intensa em relação à condução no ferro,  mostrando, então, características de mau condutor. O mesmo não pode ser afirmado para a condução\n"
                + "de eletricidade, pois os valores ainda são praticamente desconhecidos ou imprecisos.\n"
                + "O fráncio é bastante raro na crosta terrestre. Vagos vestígios são encontrados em minérios de urânio (pois faz parte da série de desintegrações deste).\n"
                + "Apesar de bastante escasso, apenas um pequeno montante de frâncio pode ser necessário para acarretar os mais diversos problemas de saúde ligados\n"
                + "a materiais radioativos. Mas, como a exposição a esse elemento é tão restrita, os casos de contaminação são nulos.");
        Distribuicao("2", "8", "18", "32", "18", "8", "1");
    }
    
    public void Radio(){
        setTitle("Rádio");//88
        jtfMassa.setText("226");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/radio.jpg")));
        jtaDescricao.setText("É um metal branco prateado e é extremamente radioativo, seu ponto de fusão é de 700ºC e de ebulição é de 1500ºC. É necontrado na natureza no\n"
                + "minério de urânio. Seu nome provém do latim 'raium' que signigica raio, em virtude do metal e seus compostos apresentarem luminescência devido a\n"
                + "sua extrema radioatividade estendendo-se de 900 a 2000 vezes superior a do urânio. Foi descoberto em 1898 por Marrie Currie e Pierre Currie,\n"
                + "após começarem a pesquisar o minério de urânio descobriram a presença do elemento. O metal possui características bastante semelhantes aos\n"
                + "metais alcalino-Terrosos, uma delas é sua vigorosa reação com água.  Em nosso organismo se comporta como cálcio acumulando-se em nossos\n"
                + "ossos, porém este é carcinogênico. Atualmente a utilização do rádio é bastante pequena, pelo motivo de ser muito raro dificilmente está disponível\n"
                + "comercialmente e de ser extremamente perigoso. No passado era utilizado na fabricação de tintas luminescentes. É produzido a partri dos resíduos\n"
                + "da purificação do urânio.");
        Distribuicao("2", "8", "18", "32", "18", "8", "2");
    }

    public void Actinio() {
        setTitle("Actínio");//89
        jtfMassa.setText("227");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/actinio.jpg")));
        jtaDescricao.setText("Foi descoberto por A. Debierre em 1899, e idependentimente por F. O. Giesel em 1902. Foi primeiro reconhecido no mineral pechblenda,\n"
                + "aparecendo na proporção de 0,15 mg pro tonelada de minério. Seu ponto de fusão é de 1050ºC e tem uma semivida de 22 anos. Diversos outros\n"
                + "isótopos naturais e artificiais são conhecidos, mas com execeção do de massa 228 têm período mutio curto para serem isolados em forma\n"
                + "macroscópica. O actínio é isolado com dificuldadde, a partir de minérios de urânio contendo urânio 235. Uma melhor fonte é a transmutação de\n"
                + "rádio sob intenso bombardeio de nêutrons oriundos de uma pilha atômnica. Foi o processo usado por F. Hagemann, em 1950, que possibilitou a\n"
                + "investigação das propriedades químicas do metal. Os elementos de número atômico 90 a 103 são denominados actinídeos por possuirem\n"
                + "propriedades muito semenlhantes com o actínio.");
        Distribuicao("2", "8", "18", "32", "18", "9", "2");
    }

    public void Torio(){
        setTitle("Tório");//90
        jtfMassa.setText("232,03806");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/torio.jpg")));
        jtaDescricao.setText("Elemento químico metálico radioativo, foi descoberto por J.J Berzelius em 1828. Seu nome deriva-se de Tor, deus da guerra na mitologia escadinava\n"
                + "Apesar de ser um elemento raro , desempenha importante papel na tecnologia e na indústria. O tório é o principal constituinte de silicosos como a\n"
                + "teoria, a orangita, a aurelita, a calciotrita e a torianita, cujos depósiots na natureza são tão pequenos que não podem ser explorados industrialmente.\n"
                + "O tório metálico apresenta-se preto ou cinza; logo após ser cortado, é prateado. É maleável e dúctil; pode ser forjado e estampado. Seu ponto de\n"
                + "fusão é 1750ºC, e o de ebulição, cerca de 3500ºC. O tório é dissolvido pelo ácido clorídrico, quase não reage com enxofre e cloro.\n"
                + "O tório é muito usado atualmente como combustível para reatores nucleares, depois de transformado em urâni-233. o óxido de tório ocnstitui a base\n"
                + "da indústria de camisas para lampiõs, sendo ainda empregado para controlar a dimensão do grão dos filamentos de tungstênio para lâmpadas, em\n"
                + "ligas metálicas para emissão termoiônica, em eletrodos para arcos de solda.");
        Distribuicao("2", "8", "18", "32", "18", "10", "2");
    }
    
    public void Protactinio() {
        setTitle("Patrocínio");//91
        jtfMassa.setText("231,03588");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/protactinio.jpg")));
        jtaDescricao.setText("Nas condições ambiente, é sólido de aparência branco-prateada e brilhante (se exposto ao ar, essa coloração toma forma acinzentada por causa da\n"
                + "formação de óxidos). É radioativo (núcleo não muito estável) e tóxico, justamente pela emissão de partículas alfa. Seu ponto de fusão está em torno\n"
                + "de 1570ºC e de ebulição 4030ºC. O protactínio é um intermediário condutor de calor (conduz cerca de 40% menos do que o ferro) e praticamente\n"
                + "um mau condutor de eletricidade (conduz cerca de 50% menos do que o ferro). A prata, o melhor condutor conhecido, é 12 vezes mais eficiente.\n"
                + "Sob sua forma natural é muito raro. Entretando pode ser encontrado junto às reservas de tório, plutônio e urânio (já que é produto da fissão desses)\n"
                + "elementos. As aplicações estão muito mais associadas aos ramos teóricos da física moderna do que na indústria ou cotidiano.\n"
                + "Por ser radioativo e tóxico ao organismo humano, deve-se manter exposição controlada seguindo uma série de regras de segurança, dentre elas o\n"
                + "uso de roupa adequada, tempo de exposição o menor possível e evitar ao máximo contato direto.");
        Distribuicao("2", "8", "18", "32", "20", "9", "2");
    }

    public void Uranio(){
        setTitle("Urânio");//92
        jtfMassa.setText("238,02891");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/uranio.jpg")));
        jtaDescricao.setText("E o elemento natural de maior número atômico, seu ponto de fusão é de 1132ºC. Quimicamente é bastante reativo, podendo reagir facilmente como\n"
                + "oxigenio e com ácidos. Ocorre na natureza principalmente sob as forma de um silicato complexo. Os principais depósitos de urânio estão no Canadá\n"
                + "EUA e África do Sul. A extração do urânio de seus minérios é um processo difícil.\n"
                + "Otto Hahn e Fritz Strassman descobriram em 1938 que um núcleo de U255, quando bombardeado por nêutrons, sofre fissão, isto é, se decompõem\n"
                + "em outros átomos de massa atômica muito menores, outros nêutrons e liberam grande quantidade de energia sob forma de calor. Com apenas um\n"
                + "de seus isótopos sofre fissão, ou seja, pode ser usado como combustível nuclear, é necessário proceder-se ao enrequicimento do urânio natural, que\n"
                + "contém apenas 0,72% de U235. O urânio 238, apesar de não sofrer fissão quando bombardeado pelos nêutrons produzidos na fusão do U235, poden\n"
                + "produzir plutônio que, por sua vez é físsil. Desse modo, quando se utiliza urânio natural, nos nos reatores nucleares, o urânio 235 sofre fissão e o\n"
                + "urânio 238 é transformado em plutônio. O plutônio, que é físsil, pode depois sser usado também como combustível.");
        Distribuicao("2", "8", "18", "32", "21", "9", "2");
    }
    
    public void Netunio() {
        setTitle("Netúnio");//93
        jtfMassa.setText("237");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neptunio.jpg")));
        jtaDescricao.setText("Elemento de número atômico 93, símbolo Np, transurânico, prateado, radioativo, tóxico, raro, metálico e resistente. Reage com oxigênio e ácidos e é\n"
                + "atacado por vapor de água. Foi descoberto em 1940 por Edwin M. McMillan nos Estados Unidos, pelo bombardeamento de urânio com nêutrons\n"
                + "lentos. Seu nome é dado em referência ao planeta Netuno.");
        Distribuicao("2", "8", "18", "32", "22", "9", "2");
    }

    public void Plutonio() {
        setTitle("Plutnio");//94
        jtfMassa.setText("244");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/plutonio.jpg")));
        jtaDescricao.setText("Elemento químico radioativo. É o mais importante dos elementos transuranídeos, devido ao seu amplo emprego como combustível em reatores\n"
                + "nucleares e como ingrediente ativo nas armas atômicas. o plutônio foi obtido pela primeira vez em laboratório por Glem T. Seaborg, Edwin McMillan\n"
                + "Joseph W. Kennedy e Arthur C. Wahl, em 1940, quando submeteram o urânio ao bombradeamento com deutério. A seguir encontraram-se pequenas\n"
                + "quantidades em minérios de uranio. É um metal prateado que toma uma coloração amarelada quando exposto ao ar. Devido ao calor desenvolvido\n"
                + "na sua desintegração radioativa, pedaços de pltônio podem levar a água à ebulição. O elemento emite partículas alfa com intensidade, pelo que se\n"
                + "torna perigoso na aplicação radiológica e no manuseio. Todos os isótopos do plutônio são radioativos. Destaca-se o plutônio-239, por sofrer fissão\n"
                + "mais facilmente, e poder ser produzido rapidamente, em grande quantidade, em reatores regeneradores. A informação sobre essas características do\n"
                + "plutônio-239 só foi divulgada em agosto de 1945, com a explosão de uma bomba de plutônio sobre Nagasaki.");
        Distribuicao("2", "8", "18", "32", "24", "8", "2");
    }

    public void Americio() {
        setTitle("Amerício");//95
        jtfMassa.setText("243");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/americio.jpg")));
        jtaDescricao.setText(" Elemento químico radioativo, obtido por bombardeio de plutônio com partículas aceleradas. O amerício teve seu nome dado em homenagem ao\n"
                + "continente Americano. Todos os seus isótopos são radioativos. À temperatura ambiente, o amerício encontra-se no estado sólido.  O metal amerício\n"
                + "recém obtido tem o aspecto branco-prateado brilhante (mais prateado do que o plutônio ou netúnio), perdendo o brilho lentamente em presença do ar\n"
                + "seco, na temperatura ambiente.");
        Distribuicao("2", "8", "18-", "32", "25", "8", "2");
    }

    public void Curio() {
        setTitle("Cúrio");//96
        jtfMassa.setText("247");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/curio.jpg")));
        jtaDescricao.setText("Sintetizado em 1945, pelo bombardeio de plutônio com partículas alfa no ciclotron da Universidade da Califórnia. Quimicamente reativo, é um metal\n"
                + "de aspecto branco-prateado (a maioria dos seus compostos trivalentes são ligeiramente amarelos), maleável e, devido a sua elevada radioatividade,\n"
                + "brilha no escuro. O cúrio é obtio sinteticamente sujeitando o plutônio a um bombardeio de partículas alfa.Quantidades muito pequenas de cúrio\n"
                + "podem existir no minério de urânio, como produto de deterioração natural, porém nunca foi detectado.");
        Distribuicao("2", "8", "18", "32", "25", "9", "2");
    }

    public void Berquelio() {
        setTitle("Berquélio");//97
        jtfMassa.setText("247");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/berquelio.jpg")));
        jtaDescricao.setText("Elemento químico radiativo, obtido em 1949 por Thompson, Ghiorso e Seaborg na Universidade de Berkeley, na Califórnia. Quantidades\n"
                + "macroscópicas de berquélio-249 obtidas sinteticamente tornaram possível determinar algumas das propriedades do elemento. Mesmo que, até o\n"
                + "presente momento não tenha sido isolado na forma elementar, é possível prever que se trata de um elemento de aspecto prateado metálico, que\n"
                + "oxida-se  facilmente no ar em temperaturas elevadas, e será solúvel em ácidos minerais diluídos.");
        Distribuicao("2", "8", "18", "32", "27", "8", "2");
    }

    public void Californio() {
        setTitle("Califórnio");//98
        jtfMassa.setText("251");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/californio.jpg")));
        jtaDescricao.setText("Elemento químico radioativo com vários isótopos, uma das maiores fontes conhecidas de nêutrons. Foi descoberto em 1950 por uma equipe de\n"
                + "pesquisadores norte-americana na Universidade da Califórnia, Berkeley, bombardeando o elemento cúrio com partículas alfa. O seu principal uso é\n"
                + "como fonte de nêutrons para a análise do solo terrestre ou de outros planetas através de sondas espaciais.\n"
                + "Quantidades de califórnio obtidos sinteticamente tornaram possível determinar algumas propriedades macroscópicas deste elemento. Por ser\n"
                + "um forte emissor de nêutrons é extremamente radioativo e prejudicial (um miligrama emite espontaneamente 170 milhões de nêutrons por minuto).\n"
                + "O Califórnio tem alguns usos especiais devido a sua condição de elemento radioativo, porém é demasiadamente difícil obtê-lo para produzir alguma\n"
                + "utilização significativa.");
        Distribuicao("2", "8", "18", "32", "28", "8", "2");
    }

    public void Einstenio() {
        setTitle("Einstênio");//99
        jtfMassa.setText("252");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/einstenio.jpg")));
        jtaDescricao.setText("Elemento químico radioativo. Assim como a maioria dos actinídeos, não se encontra na natureza. Foi descoberto originalmente em 1952, pelo\n"
                + "químico americano Albert Ghiorso e seus colegas de trabalho em Berkeley, através de restos de uma explosão termonuclear do pacífico. O elemento\n"
                + "foi nomeado em honra ao físico Albert Einstein. É o actinídeo mais pesado daqueles em que se pode determinar essa propriedade. O metal é\n"
                + "quimicamente reativo, muito volátil e conhece-se uma estrutura cristalina. O einstéinio é um elemento transurânico do grupo dos actinídeos da tabela\n"
                + "periódica. São conhecidos 14 isótopos do einstéinio atualmente. Atualmente, só se produzem einstéinio em pequenas quantidades.");
        Distribuicao("2", "8", "18", "32", "29", "8", "2");
    }

    public void Fermio() {
        setTitle("Férmio");//100
        jtfMassa.setText("257");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fermio.jpg")));
        jtaDescricao.setText("Elemento químico radioativo artificial, Descoberto em 1952 por Albert Ghiorso e seus colaboradores associado às ruínas provocadas por uma\n"
                + "explosão termonuclear que ocorreu no Pacífico. O nome férmio é uma homenagem ao físico italiano Enrico Fermi (1901-1954). O férmio não ocorre\n"
                + "naturalmente na Natureza. É estudado em poucos laboratórios de investigação, onde a sua elevada radioatividade requer cuidados especiais de\n"
                + "manuseamento e técnicas apropriadas. O férmio não possui aplicações.");
        Distribuicao("2", "8", "18", "32", "30", "8", "2");

    }

    public void Mendelevio() {
        setTitle("Mendelévio");//101
        jtfMassa.setText("258");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/mendelevio.jpg")));
        jtaDescricao.setText("Elemento químico artificial, sólido e radioativo, indentificado em 1955 pro Albert Ghiorso, Bernard G., Harvey, Gregory R. Choppin,\n"
                + "Stanley G. Thompson e Glenn T. Seaborg na universidade de Berkeley, na Califórnia.\n"
                + "É o décimo segundo elemento da série dos actinídeos. Foi nomeado em homenagem ao químico russo Dimitri Mendeleiev, que desenvolveu a tabela\n"
                + "periódica e formulou a lei periódica. O mendelévio não se encontra na natureza e se prepara por transmutação nuclear.\n"
                + "As quantidades de mendelévio que se obtêm e são utilizadas nos estudos são menores do que um milhão de átomos.");
        Distribuicao("2", "8", "18", "32", "31", "8", "2");
    }

    public void Nobelio() {
        setTitle("Nobélio");//102
        jtfMassa.setText("259");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nobelio.jpg")));
        jtaDescricao.setText("Elemento transurânico, radioativo, obtido artificialmente em 1958. Em 1957 foram anunciadas pela primeira vez a síntese e a identificação do novo\n"
                + "elemento, feitas simultaneamente pelo laboratório nacional Argonne, dos EUA, o Estabelecimento de Pesquisas em Energia Atômica, da Inglaterra, e\n"
                + "o instituto Nobel de Física, da Suécia. Entretando a repetção das experiênicas não tiveram os resultados esperados. O crédito da descoberta foi\n"
                + "assim dado a A. Ghiorso, T. Sikkeland, J. R. Walton e Glenn T. Seaborg, da Universidade da Califórnia, que, em 1958, o produziram, bombardeando\n"
                + "um átomo de cúrio com íons de carbono. O isótopo produzido tinha uma semi-vida de cerca de 1 min. As propriedades químicas do nobélio ainda\n"
                + "não foram suficientemente estudadas.");
        Distribuicao("2", "8", "18", "32", "32", "8", "2");
    }

    public void Laurencio() {
        setTitle("Laurêncio");//103
        jtfMassa.setText("262");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/laurencio.jpg")));
        jtaDescricao.setText("Descoberto em 1961, na Univerisdade da Clifórnia, por Ghiroso, Sikkeland, Larsh e Latimer. Último membro da série dos actinídeos, seu nome é\n"
                + "homenagem ao físico norte-americano Ernest Orlando Lawrence (1901-1958), inventor do ciclotron e fundador do Laboratório de Radiação, onde\n"
                + "esse e outros elementos transuranianos foram descobertos. Não existe em estado natural.");
        Distribuicao("2", "8", "18", "32", "32", "8", "3");
    }

    public void Rutherfordio(){
        setTitle("Rutherfórdio");///104
        jtfMassa.setText("267");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rutherfordio.jpg")));
        jtaDescricao.setText("O rutherfórdio é um elemento prateado, metálico, produzido artificialmente em pequenas quantidades e altamente radioativo. Sendo assim o elemento\n"
                + "não apresenta qualquer aplicação conhecida e pouco se conhece sobre ele. Em novembro de 1969, Al Ghiorso propôs que o elemento 104 deveria\n"
                + "ser chamado de rutherfórdio, em homenagem a Ernest Rutherford foi quem primeiro explicou a natureza da radioatividade e ganhou o Prêmio Nobel\n"
                + "em química no ano de 1908.");
        Distribuicao("2", "8", "18", "32", "32", "10", "2");
    }
    
    public void Dubnio() {
        setTitle("Dúbnio");//105
        jtfMassa.setText("268");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dubnio.jpg")));
        jtaDescricao.setText("Em 1967, G.N. Flerov, informou que uma equipe soviética de pesquisadores do Joint Institute de pesquisa nuclear em Dubna, produziram alguns\n"
                + "átomos do elemento 260-105 e 261-105. Foi anunciada a identificação do elemento 105 pelos os pesquisadores Ghiorso, Nurmia, Haris, da\n"
                + "Universidade de Berkeley, na Califórnia. O Dúbnio é um metal de transição, de número atômico 105 e símbolo Db, como trata-se de um elemento\n"
                + "sintético (não é encontrado livre na natureza) e com uma meia vida muito curta (poucos segundos) não existem ainda muitos dados sobre este\n"
                + "elemento. O Dúbnio possui este nome em homenagem a cidade russa - Dubna -, o elemento foi produzido pela primeira vez em 1970 pelo \n"
                + "ombardeio do Califórnio com Hidrogênio.");
        Distribuicao("2", "8", "18", "32", "32", "11", "2");
    }
    
    public void Seaborgio(){
        setTitle("Seabórgio");//106
        jtfMassa.setText("271");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/seaborgio.jpg")));
        jtaDescricao.setText(" É resultante do bombardeamento do califórnio no acelerador linear de partículas de Berkeley. O nome “Seaborgium” (searbógio) é em honra ao\n"
                + "prêmio Nobel e diretor do LBL, Glenn T. Seaborg, sendo o primeiro elemento químico, a receber o nome de uma pessoa viva.\n"
                + "O seabórgio não se encontra presente na Natureza. Se este se encontrasse presente constituiria um risco devido à sua perigosa radiação. Nunca foi\n"
                + "observada a formação de grandes quantidades de seabórgio, sendo este sintetizado em pequeníssimas quantidades. O seabórgio não apresenta\n"
                + "aplicações práticas e desconhecem-se as suas reações com o ar, a água, os halogéneos, os ácidos e as bases. ");
        Distribuicao("2", "8", "18", "32", "32", "12", "2");
    }

    public void Borio(){
        setTitle("Bório");//107
        jtfMassa.setText("272");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/borio.jpg")));
        jtaDescricao.setText("O bório é um elemento produzido artificialmente Em 1981, o elemento foi claramente sintetizado e identificado, usando o Acelerador Linear Universal\n"
                + "(UNILAC) no Gesellschaft fur Schwerionenforschung (G.S.I.), em Darmstadt na Alemanha. A equipe que descobriu o elemento 107, era chefiada\n"
                + "por Armbruster e Muzenberg. A reação que produziu o elemento 107, foi proposta e aplicada anteriormente, por um grupo de cientistas soviéticos\n"
                + "do Nuclear Institute em Dubna.");
        Distribuicao("2", "8", "18", "32", "32", "13", "2");
    }
    
    public void Hassio() {
        setTitle("Hássio");//108
        jtfMassa.setText("270");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/hassio.jpg")));
        jtaDescricao.setText("Hássio é um elemento artificial radioativo, seu decaimento é extremamente rápido, sendo em questão de segundos, impossibilitando assim que se\n"
                + "colete dados muito precisos sobre ele. Como o mesmo não possui amostra física devido ao seu decaimento acelerado, suspeita-se que seja de cor\n"
                + "prateada e metálico, e semelhante ao ósmio. Foi isolado pela primeira vez em 1984 pelo grupo de Gesellschaft fur Schwerionenforschung (G.S.I.)\n"
                + "em Darmstadt, chefiado por Armbruster e Muzenbergn.");
        Distribuicao("2", "8", "18", "32", "32", "14", "2");
    }

    public void Meitnerio() {
        setTitle("Meitnério");//109
        jtfMassa.setText("276");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/meitnerio.jpg")));
        jtaDescricao.setText("O meitnério é um elemento produzido artificialmente. Em 1982, os físico no Heavy Ion Research Laboratory, chefiado por Ambruster e Muzenbergn,\n"
                + "sintetizaram e identificaram o elemento 109, na Alemanha. A produção do elemento de meitnério é extremamente pequena. Um átomo do elemento,\n"
                + "leva uma semana para ser produzido no acelerador nuclear.\n"
                + "O nome meitnério foi sugerido para homenagear a física austríaca Lise Meitner, pioneira junto com Hoto Hahn no desenvolvimento da fissão nuclear,\n"
                + "técnica que permitiu a criação de bombas atômicas e a construção de usinas nucleares para a geração de energia termo-elétrica.");
        Distribuicao("2", "8", "18", "32", "32", "15", "2");
    }

    public void Darmstadio() {
        setTitle("Darmstádio");//110
        jtfMassa.setText("281");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/darmstadio.jpg")));
        jtaDescricao.setText("É um elemento metálico sintético, de cor branco-prateada ou acinzentada. O darmstádio foi descoberto a 9 de novembro de 1994, por\n"
                + "uma equipa constituída pelos cientistas S. Hofmann, V. Ninov, F. P. Hessberger, Peter Armbruster, Gottfried Munzenber, H. Folger, H. J. Schott\n"
                + "e seus colaboradores, na Alemanha. Este novo elemento foi produzido pela fusão de átomos de níquel e átomos de chumbo. Este processo foi\n"
                + "realizado acelerando os átomos de níquel até uma elevada energia usando o acelerador de ions pesados. Este elemento possui esta designação\n"
                + "associada com o fato de por vezes se nomear os elementos com o nome do local onde foram descobertos. Com este elemento foi descoberto na\n"
                + "cidade de Darmstadt, na Alemanha, também é conhecido em português por darmstátio.\n"
                + "O darmstádio não se encontra presente na Natureza. Se este se encontrasse presente constituiria um risco devido à sua perigosa radiação.Nunca foi\n"
                + "observado a formação de grandes quantidades de darmstádio uma vez que este decai muito rapidamente devido à emissão de partículas alfa que\n"
                + "constituem o núcleo dos átomos de hélio.");
        Distribuicao("2", "8", "8", "32", "32", "17", "1");
    }
    
    public void Roentgenio(){
        setTitle("Roentgênio");//111
        jtfMassa.setText("280");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/roentgenio.jpg")));
        jtaDescricao.setText("É um elemento produzido artificialmente. Em 1994 um grupo de cientistas chefiado por Armbruster no Heavy Ion Research Laboratory (G.S.I.) em\n"
                + "Darmstadt na Alemanha produziram três átomos do isótopo Ununúnio 272, através da reação nuclear entre o bismuto 209 e o níquel 64 em um\n"
                + "acelerador linear de partículas (UNILAC). Recebeu esse nome em homenagem ao físico alemão Wilhelm Conrad Roentgen, que descobriu os raios-X");
        Distribuicao("2", "8", "18", "32", "32", "18", "2");
    }

    public void Copernicio() {
        setTitle("Copernício");//112
        jtfMassa.setText("285");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/copernicio.jpg")));
        jtaDescricao.setText("Os cientistas produziram o copernício pela primeira vez em 9 de Fevereiro de 1996. Usando um acelerador de 100 metros de comprimento, a equipe\n"
                + "do Dr. Sigurd Hofmann disparou íons de zinco sobre uma folha de chumbo. A fusão dos núcleos atômicos dos dois elementos produziu um átomo\n"
                + "do novo elemento 112, que dura apenas uma fração de segundo. Os cientistas foram capazes de identificá-lo medindo as partículas alfa emitidas\n"
                + "durante o decaimento radioativo do novo átomo. O elemento químico mais pesado que se conhece, já reconhecido pela União Internacional de\n"
                + "Química Pura e Aplicada (IUPAC, em inglês), é 277 vezes mais pesado que o hidrogênio. O elemento, com número atômico 112, recebeu o nome\n"
                + "de copernicium na versão oficial - aportuguesado para copernício. O nome é uma homenagem ao astrônomo Nicolau Copérnico (1473-1543).");
        Distribuicao("2", "8", "18", "32", "32", "18", "2");
    }
    public void Ununtrio(){
        setTitle("Ununtrio");//113
        jtfMassa.setText("284");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununtrio.jpg")));
        jtaDescricao.setText("O Ununtrio (nome temporário, do latim um, um, três) ou Eka-tálio (semelhante ao tálio) possui provavelmente massa atômica [284]. É um elemento\n"
                + "químico sintético.  Descoberto no início de 2004 por uma equipe de cientistas russos e norte-americanos. É um transurânico, provavelmente um\n"
                + "sólido de aspecto prateado. Não pode ser encontrado na natureza, pois para obtê-lo a sua estrutura tem de ser modificada para chegar a um resultado\n"
                + "exato. Em 1 de fevereiro de 2004, o ununtrio e o ununpentio foram sintetizados, conforme relatado por uma equipe de cientistas russos de Dubna e\n"
                + "cientistas norte-americanos do Lawrence Livermore National Laboratory. Esta descoberta ainda está à espera de confirmação.\n"
                + "Em 28 de setembro de 2004, uma equipe de cientistas japoneses declarou que obtiveram êxito na obtenção deste elemento.");
        Distribuicao("2", "8", "18", "32", "32", "18", "3");
    }
    

    public void Ununquadio(){
        setTitle("Ununquádio");//114
        jtfMassa.setText("289");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununquadio.jpg")));
        jtaDescricao.setText("Ununquádio (nome provisório, do latim um, um, quatro) ou Eka-chumbo (semelhante ao chumbo) é um elemento químico sintético. É um elemento\n"
                + "transurânico, radioativo, provavelmente metálico, sólido, de aspecto prateado. Foi sintetizado por uma equipe de cientistas russos (Dubna), em 1999.\n"
                + "Junto com o ununpentio toma parte da denominada ilha de estabilidade, um lugar cujos elementos químicos, teoricamente, deveriam ser mais estáveis\n"
                + "do que aqueles que os rodeiam. Em janeiro de 1999 foi relatado informalmente pelos cientistas de Dubna na Rússia, a síntese do elemento 114.\n"
                + "A mesma equipe produziu um outro isótopo de Uuq três meses mais tarde. Desde então, não foi mais sintetizado. Alguns pesquisadoreso denominam\n"
                + "de eka-chumbo, conjecturando que as suas propriedades são similares aos do chumbo.");
        Distribuicao("2", "8", "18", "32", "32", "18", "4");
    }
    
    public void Ununpentio(){
        setTitle("Ununpentio");//115
        jtfMassa.setText("288");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununpentio.jpg")));
        jtaDescricao.setText("O Ununpentio (nome temporário, do latim um, um, cinco) ou eka-bismuto (semelhante ao bismuto) é um elemento químico sintético. É um elemento\n"
                + "transurânico, radioativo, provavelmente metálico, sólido, de aspecto prateado. A descoberta foi anunciada por cientistas russos e norte-americanos\n"
                + "no início de 2004. Em 1 de fevereiro de 2004, a síntese dos elementos ununtrio e ununpentio foi relatada por uma equipe composta de cientistas\n"
                + "russos na Universidade de Dubna do Joint Institute for Nuclear Research, e por cientistas norte-americanos do Lawrence Livermore National\n"
                + "Laboratory. A equipe relatou que bombardeou amerício com cálcio para produzir quatro átomos de ununpentio. Estes átomos, segundo o relato,\n"
                + "deteriou em átomos de ununtrio numa fração de segundos.");
        Distribuicao("2", "8", "18", "32", "32", "18", "5");
    }
    
    public void Ununhexio(){
        setTitle("Ununhéxio");//116
        jtfMassa.setText("293");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununhexio.jpg")));
        jtaDescricao.setText("O ununhexio (nome provisório, do latim um, um, seis) ou eka-polônio (semelhante ao polônio) é um elemento químico sintético. É um elemento\n"
                + "transurânico, adioativo, superpesado, provavelmente metálico, sólido, de aspecto prateado. A descoberta foi relatada pelos norte-americanos em\n"
                + "1999 e pelos russos em 2001, porém a confirmação dos resultados ainda continua pendente. Nas décadas de 80 e 90, Bob Lazar afirmava que o\n"
                + "ununhexio funcionava como combustível de objetos voadores não-identificados, pois sua deterioração produziria antimatéria. Este processo é\n"
                + "considerado implausível em termos de física nuclear.");
        Distribuicao("2", "8", "18", "32", "32", "18", "5");
    }
    public void Ununseptio(){
        setTitle("Ununséptio");//17
        jtfMassa.setText("294");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununseptio.jpg")));
        jtaDescricao.setText("O Ununséptio (do latim um, um, sete) ou Eka-Astatínio é o nome provisório.Elemento transurânico provavelmente um sólido de coloração escura.\n"
                + "Será um átomo superpesado com massa atômica prevista de [291] u, altamente instável. Uma equipe internacional de cientistas da Rússia e dos\n"
                + "Estados Unidos descobriu o elemento de numero atômico 117 em abril de 2010.\n"
                + "A equipe o encontrou medindo padrões de decaimento observados depois que um alvo de berquélio radioativo foi bombardeado com íons de cálcio\n"
                + " no ciclotron JINR em Dubna, na Rússia. O experimento produziu seis átomos do elemento 117 depois de bombardearem o alvo continuamente por\n"
                + "150 dias. A descoberta contou com a participação de cientistas do Joint Institute of Nuclear Research, Research Institute for Advanced Reactors\n"
                + "Lawrence Livermore National Laboratory, Oak Ridge National Laboratory, Universidade Vanderbilt e Universidade de Nevada, nos Estados Unidos.\n"
                + "Ele era o último elemento que faltava na linha sete da tabela e é um elemento preparado sinteticamente.");
        Distribuicao("2", "8", "18", "32", "32", "18", "7");
    }
    
    
    public void Ununoctio(){
        setTitle("Ununóctio");//118
        jtfMassa.setText("294");
        jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununnoctio.jpg")));
        jtaDescricao.setText("Ununóctio (do latim um, um, oito) é o nome provisório do elemento químico superpesado. Pela posição na tabela periódica, a previsão é que\n"
                + "apresente propriedades químicas similares ao radônio. Por isso, também é conhecido pelo nome de eka-radônio. Provavelmente será o segundo\n"
                + "elemento radioativo, e o primeiro gás com semicondutividade. Em 10 de outubro de 2006, pesquisadores do Instituto Conjunto para Pesquisa Nuclear\n"
                + "da Rússia e do Lawrence Livermore National Laboratory dos EUA anunciaram na Physical Review C que haviam detectado indiretamente o elemento\n"
                + "118  produzido por meio de colisões de átomos de califórnio e de cálcio. Ununóctio é um nome sistemático, temporário, adotado pela IUPAC para o\n"
                + "elemento 118.");
        Distribuicao("2", "8", "18", "32", "32", "18", "8");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jlElemento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfMassa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDistribuicao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtaDescricao.setColumns(20);
        jtaDescricao.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Nº Atômico");

        jtfMassa.setEditable(false);
        jtfMassa.setFont(new java.awt.Font("Tahoma", 1, 18));
        jtfMassa.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Massa Atômica:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Distribuição Eletrônica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jtDistribuicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "K", "L", "M", "N", "O", "P", "Q"
            }
        ));
        jtDistribuicao.setEnabled(false);
        jScrollPane2.setViewportView(jtDistribuicao);
        jtDistribuicao.getColumnModel().getColumn(0).setHeaderValue("K");
        jtDistribuicao.getColumnModel().getColumn(1).setHeaderValue("L");
        jtDistribuicao.getColumnModel().getColumn(2).setHeaderValue("M");
        jtDistribuicao.getColumnModel().getColumn(3).setHeaderValue("N");
        jtDistribuicao.getColumnModel().getColumn(4).setHeaderValue("O");
        jtDistribuicao.getColumnModel().getColumn(5).setHeaderValue("P");
        jtDistribuicao.getColumnModel().getColumn(6).setHeaderValue("Q");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addGap(155, 155, 155)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMassa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128))
                            .addComponent(jlElemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-899)/2, (screenSize.height-541)/2, 899, 541);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlElemento;
    private javax.swing.JTable jtDistribuicao;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JTextField jtfMassa;
    // End of variables declaration//GEN-END:variables
    private static Descricao instance = null;

    /**
     * Método para se ter acesso a tudo que foi feitos por mim nesta classe
     * @return Todos os métodos existentes nesta classe
     */
    public static Descricao getInstance() {
        if (instance == null) {
            instance = new Descricao();
        }
        return instance;
    }

    /**
     * Faz com que seja mostrada a tela que contém as informações dos elementos químicos
     */
    public static void showInstance() {
        getInstance().setVisible(true);
    }
}