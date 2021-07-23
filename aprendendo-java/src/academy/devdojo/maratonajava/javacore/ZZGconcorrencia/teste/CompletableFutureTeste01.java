package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.servirce.StoreService;

public class CompletableFutureTeste01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricessSync(storeService);
    }

    private static void searchPricessSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        System.out.println(storeService.getPriceSync("Store 5"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n",end-start);
    }

    private static void searchPricesAsync(StoreService storeService) {

    }

}
