package br.com.bernardo.grilldream.helper

import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.model.InfoLanche
import br.com.bernardo.grilldream.model.Lanche

val listaDeLanches = mutableListOf(
    Lanche(
        "Gourmet Bliss",
        R.drawable.gourmet_bliss,
        19.90,
        "Delicie-se com o sabor sofisticado do \"Gourmet Bliss\". Este hambúrguer " +
                "apresenta uma mistura única de carne bovina e suína, queijo brie derretido, " +
                "cebola caramelizada e alface crocante, tudo abraçado por um pão australiano.",
        4F,
        InfoLanche("Brioche", "Brisket", "180g")
    ),
    Lanche(
        "Heavenly Bites",
        R.drawable.heavenly_bites,
        24.75,
        "Experimente a perfeição celestial com o \"Heavenly Bites\". Um hambúrguer " +
                "divino de carne bovina, queijo gorgonzola, cogumelos salteados, rúcula fresca " +
                "e um toque de molho balsâmico, tudo isso entre dois pedaços de pão de nozes.",
        5F,
        InfoLanche("Americano", "Fraldinha", "220g")
    ),
    Lanche(
        "Juicy Beast",
        R.drawable.juicy_beast,
        19.90,
        "Prepare-se para uma explosão de sabores com \"Juicy Beast\"! Um hambúrguer " +
                "suculento com carne bovina de alta qualidade, queijo derretido, alface fresca, " +
                "tomate maduro e nosso molho especial, tudo cuidadosamente empilhado entre " +
                "dois pedaços macios de pão brioche.",
        4F,
        InfoLanche("Brioche", "Angus", "180g")
    ),
    Lanche(
        "Umami Eruption",
        R.drawable.umami_eruption,
        26.00,
        "Uma erupção de sabores intensos aguarda você no \"Umami Eruption\". Este " +
                "hambúrguer único é feito com suculento frango marinado, queijo asiático, " +
                "alface crocante e nosso molho umami especial, tudo isso " +
                "entre um pão italiano.",
        4F,
        InfoLanche("Italiano", "Peito de frango", "200g")
    ),
    Lanche(
        "Master Deluxe",
        R.drawable.master_deluxe,
        22.50,
        "O \"Master Deluxe\" é a escolha perfeita para os amantes de hambúrgueres gourmet. " +
                "Com um suculento hambúrguer de carne bovina angus, queijo suíço derretido, " +
                "bacon crocante, alface fresca e nosso molho exclusivo, tudo isso abraçado " +
                "por um pão artesanal.",
        5F,
        InfoLanche("Ciabatta", "Angus", "200g")
    ),
    Lanche(
        "Prime Stack",
        R.drawable.prime_stack,
        18.90,
        "Sinta a realeza ao dar uma mordida no \"Prime Stack\"! Com carne de " +
                "primeira qualidade, queijo cheddar derretido, cebolas caramelizadas, " +
                "e nosso molho especial, servido entre camadas de um pão de " +
                "hambúrguer leve e dourado.",
        4F,
        InfoLanche("Pão de batata", "Prime Rib", "160g")
    ),
    Lanche(
        "Savory Summit",
        R.drawable.savory_summit,
        21.90,
        "Suba ao topo do sabor com o \"Savory Summit\". Apresentando um hambúrguer " +
                "de carne bovina, queijo suíço derretido, cogumelos sauté, alface fresca e " +
                "um toque de mostarda dijon, tudo isso entre um pão de centeio macio.",
        5F,
        InfoLanche("Australiano", "Costela", "180g")
    ),
    Lanche(
        "Sizzle Fusion",
        R.drawable.sizzle_fusion,
        22.90,
        "Sinta a fusão de sabores com o \"Sizzle Fusion\". Este hambúrguer incrível " +
                "inclui carne bovina temperada, queijo provolone derretido, pimentões " +
                "grelhados, cebolas caramelizadas e nosso molho especial, servido em um " +
                "pão integral multigrãos.",
        5F,
        InfoLanche("Pão de cebola", "Bacon e Angus", "190g")
    )
)