package academy.devdojo.maratonajava;

import java.util.List;
import java.util.Random;

public class Exemplos {
    private static final Random random = new Random();
    private static final List<String> nomesClientesPessoaFisica = List.of(
            "Ana Silva", "João Santos", "Maria Oliveira", "Pedro Souza", "Juliana Costa",
            "Fernanda Lima", "Rafael Almeida", "Carolina Santos", "Marcos Oliveira", "Luiza Costa",
            "Daniel Pereira", "Mariana Alves", "Rodrigo Souza", "Camila Santos", "Felipe Oliveira",
            "Laura Costa", "Gabriel Martins", "Isabela Fernandes", "Lucas Lima", "Manuela Rodrigues",
            "Gustavo Pereira", "Natália Almeida", "Rafaela Silva", "Thiago Santos", "Amanda Oliveira",
            "Marcelo Costa", "Larissa Martins", "Ricardo Fernandes", "Patrícia Lima", "Vinícius Rodrigues",
            "Sandra Pereira", "Eduardo Alves", "Beatriz Souza", "José Silva", "Cristina Santos",
            "Roberto Oliveira", "Carla Costa", "André Martins", "Vanessa Fernandes", "Antônio Lima",
            "Priscila Rodrigues", "Paulo Pereira", "Bianca Almeida", "Fábio Santos", "Helena Oliveira",
            "Renato Costa", "Natasha Martins");

    private static final List<String> nomesClinteEmpresas = List.of(
            "Tech Solutions Inc.", "Global Electronics Ltd.", "Innovative Consulting Group",
            "Express Logistics Services", "Alpha Industries", "Beta Distributors",
            "Gamma Apparel Stores", "Delta Advertising Agency", "Constructive Builders Ltd.",
            "BioPharma Labs", "Legal Counsel LLP", "Mercantile Supermarket", "Quick Print Graphics",
            "Bella Vista Hotel", "Advanced Education School", "Power Fitness Gym", "Total Health Clinic",
            "Friendly Pets Pet Shop", "Strong Motor Mechanics", "TechShop Electronics Store",
            "Warm Bread Bakery", "Taste of Brazil Restaurant", "Fertile Land Farming Co.",
            "BuildWell Construction Materials Store", "Glamour Beauty Salon", "Fast Lane Fuel Station",
            "Fresh & Clean Laundry", "Express Rapid Transport", "New Era Cultural Publishing",
            "AppliChem Chemical Industry", "Strong Metal Works", "Happy Smile Dental Clinic",
            "Creative Design Studio", "Worldwide Travel Agency", "Athletic Sports Club",
            "Love & Charity Association", "Advanced Studies Center", "Flash Photography Studio",
            "Global Languages School", "New Cars Dealership", "Celebration Buffet",
            "AgroFort Agroindustry", "Sport Mania Sports Store", "Modern Architecture Firm",
            "PetCare Veterinary Clinic", "Innovative Projects Engineering Office",
            "Max Speed Motorcycles Dealership", "Total Sustainability Environmental Consultancy",
            "Skin Art Tattoo Studio");
    private static final List<String> nomesAnimes = List.of(
            "Naruto", "Dragon Ball", "One Piece", "Attack on Titan", "My Hero Academia",
            "Death Note", "Tokyo Ghoul", "Fullmetal Alchemist", "Sword Art Online", "Bleach",
            "Demon Slayer", "One Punch Man", "Fairy Tail", "Hunter x Hunter", "Steins;Gate",
            "Neon Genesis Evangelion", "Black Clover", "Naruto Shippuden", "Code Geass", "Cowboy Bebop",
            "Your Lie in April", "Sailor Moon", "JoJo's Bizarre Adventure", "Re:Zero", "Spirited Away",
            "Princess Mononoke", "Akira", "The Promised Neverland", "Kimetsu no Yaiba", "Attack on Titan",
            "Haikyuu!!", "Dr. Stone", "Mob Psycho 100", "Fate/stay night", "The Seven Deadly Sins",
            "Initial D", "Yu Yu Hakusho", "Gurren Lagann", "Berserk", "My Neighbor Totoro",
            "Ghost in the Shell", "K-On!", "Hellsing", "Evangelion: 3.0+1.0 Thrice Upon a Time", "Violet Evergarden",
            "Trigun", "Prison School");


    public static String getNomePessoaFisica() {
        return nomesClientesPessoaFisica.get(random.nextInt(nomesClientesPessoaFisica.size()));
    }
    public static Void test(){
        System.out.println(nomesClientesPessoaFisica.size());

        System.out.println(nomesClinteEmpresas.size());

        System.out.println(nomesAnimes.size());

        return null;
    }

    public static String getNomeEmpresa() {
        return nomesClinteEmpresas.get(random.nextInt(nomesClinteEmpresas.size()));
    }

    public static String getAnime() {
        return nomesAnimes.get(random.nextInt(nomesAnimes.size()));
    }


}
