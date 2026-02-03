package com.spotifyoutfit.web;

public enum MusicGenre {

    POP(
        "fresh, genç, dikkat çekici",
        new String[]{"pink", "white", "blue", "yellow", "black" , "silver"},
        new String[]{"cotton", "light denim", "satin", "glossy", "ribbed"},
        new String[]{"graphic tee","crop top","layered top"},
        new String[]{"mini skirt","cargo pants","straight jeans"},
        new String[]{"sneakers","platform shoes"},
        new String[]{"mini bag","hair clip","simple jewelry"}
    ),

    ROCK_PUNK(
        "asi, sert, umursamaz",
        new String[]{"black", "dark red", "silver", "charcoal", "white"},
        new String[]{"leather", "denim", "ripped", "metal hardware", "canvas"},
        new String[]{"band tee","tank top","graphic long sleeve"},
        new String[]{"ripped jeans","leather skirt","shorts"},
        new String[]{"combat boots","chunky sneakers"},
        new String[]{"chain accessory","studded belt","rings"}
    ),

    HIP_HOP_RAP_TRAP(
        "cool, özgüvenli, sokak",
        new String[]{"black", "white", "army green", "cobalt", "grey" , "brown"},
        new String[]{"oversized cotton", "nylon", "jersey", "fleece", "mesh"},
        new String[]{"oversized hoodie","graphic tee","puffer vest"},
        new String[]{"baggy jeans","cargo pants","track pants"},
        new String[]{"chunky sneakers","high-tops"},
        new String[]{"cap","crossbody bag","silver chain"}
    ),

    RNB(
        "sexy, soft, duygusal",
        new String[]{"cream", "chocolate", "black", "rose", "gold"},
        new String[]{"silk", "satin", "soft knit", "velvet", "sheer"},
        new String[]{"off-shoulder top","fitted top","bodysuit"},
        new String[]{"fitted pants","mini skirt","slip skirt"},
        new String[]{"heels","sleek boots"},
        new String[]{"gold jewelry","mini clutch","perfume vibe"}
    ),

    ALTERNATIVE_INDIE(
        "cool ama çabasız",
        new String[]{"brown", "olive", "black", "beige", "washed blue"},
        new String[]{"tweed", "corduroy", "cotton", "suede", "vintage denim"},
        new String[]{"layered tee","overshirt","striped knit"},
        new String[]{"straight jeans","long skirt","shorts"},
        new String[]{"converse","loafers"},
        new String[]{"tote bag","simple rings","beanie"}
    ),

    JAZZ(
        "sofistike, zamansız",
        new String[]{"black", "navy", "burgundy", "cream", "gold"},
        new String[]{"wool", "cashmere", "silk", "satin", "leather"},
        new String[]{"turtleneck","silk shirt","tailored blouse"},
        new String[]{"tailored pants","pencil skirt","wide-leg trousers"},
        new String[]{"loafers","classic heels"},
        new String[]{"watch","leather bag","minimal jewelry"}
    ),

    BLUES(
        "sade, duygulu",
        new String[]{"indigo", "brown", "white", "grey", "rust"},
        new String[]{"denim", "cotton", "suede", "knit", "leather"},
        new String[]{"plain tee","denim shirt","knit top"},
        new String[]{"straight jeans","denim skirt","dark trousers"},
        new String[]{"boots","sneakers"},
        new String[]{"simple belt","crossbody bag","scarf"}
    ),

    CLASSICAL(
        "zarif, ciddi",
        new String[]{"black", "white", "navy", "emerald", "wine"},
        new String[]{"wool", "silk", "satin", "crepe", "structured fabric"},
        new String[]{"elegant blouse","structured blazer","classic knit"},
        new String[]{"tailored pants","mid skirt","formal dress bottom"},
        new String[]{"classic heels","leather shoes"},
        new String[]{"pearl-like jewelry","structured bag","coat"}
    ),

    ELECTRONIC(
        "enerjik, deneysel",
        new String[]{"neon pink", "electric blue", "black", "silver", "white"},
        new String[]{"nylon", "mesh", "vinyl", "reflective", "tech fabric"},
        new String[]{"cropped jacket","mesh top","statement tee"},
        new String[]{"cargo pants","mini skirt","tech pants"},
        new String[]{"sneakers","platform boots"},
        new String[]{"statement sunglasses","metallic bag","reflective accessory"}
    ),

    METAL(
        "karanlık, güçlü",
        new String[]{"black", "dark grey", "blood red", "silver", "deep purple"},
        new String[]{"leather", "heavy denim", "studded metal", "distressed", "matte cotton"},
        new String[]{"black band tee","long sleeve","corset top"},
        new String[]{"black jeans","leather skirt","ripped pants"},
        new String[]{"leather boots","combat boots"},
        new String[]{"spike/chain accessory","rings","choker"}
    ),

    REGGAE(
        "rahat, özgür",
        new String[]{"green", "yellow", "red", "beige", "brown"},
        new String[]{"linen", "cotton", "knit", "crochet", "washed denim"},
        new String[]{"relaxed shirt","crochet top","tank"},
        new String[]{"wide pants","shorts","relaxed jeans"},
        new String[]{"sandals","sneakers"},
        new String[]{"beanie","bracelets","canvas bag"}
    ),

    COUNTRY(
        "doğal, maskülen/feminen denge",
        new String[]{"denim blue", "tan", "white", "brown", "red"},
        new String[]{"denim", "plaid flannel", "suede", "cotton", "leather"},
        new String[]{"plaid shirt","denim jacket","white tee"},
        new String[]{"bootcut jeans","denim skirt","shorts"},
        new String[]{"cowboy boots","boots"},
        new String[]{"belt buckle","hat","leather bag"}
    ),

    FOLK(
        "doğa, nostalji",
        new String[]{"beige", "cream", "olive", "brown", "rust"},
        new String[]{"knit", "linen", "cotton", "wool", "crochet"},
        new String[]{"cardigan","linen shirt","knit top"},
        new String[]{"long skirt","wide pants","straight jeans"},
        new String[]{"boots","converse"},
        new String[]{"scarf","canvas tote","simple necklace"}
    ),

    SOUL(
        "sıcak, derin",
        new String[]{"warm brown", "mustard", "cream", "black", "gold"},
        new String[]{"velvet", "silk", "soft knit", "satin", "leather"},
        new String[]{"wrap top","silk blouse","fitted knit"},
        new String[]{"wide-leg pants","midi skirt","tailored pants"},
        new String[]{"heels","sleek boots"},
        new String[]{"gold hoops","structured bag","bracelet"}
    ),

    FUNK(
        "eğlenceli, enerjik",
        new String[]{"purple", "orange", "lime", "pink", "black"},
        new String[]{"glossy", "sequins", "denim", "ribbed knit", "leather"},
        new String[]{"statement jacket","bold top","graphic tee"},
        new String[]{"flare pants","mini skirt","shorts"},
        new String[]{"platform shoes","sneakers"},
        new String[]{"bold sunglasses","fun jewelry","mini bag"}
    ),

    KPOP(
        "iddialı, stil oyunu",
        new String[]{"black", "white", "pastel", "red", "silver"},
        new String[]{"tweed", "pleated fabric", "leather", "satin", "structured cotton"},
        new String[]{"layered top","structured jacket","cropped cardigan"},
        new String[]{"pleated mini skirt","wide pants","tailored shorts"},
        new String[]{"chunky shoes","boots"},
        new String[]{"hair clip","mini bag","statement earrings"}
    ),

    LATIN(
        "ateşli, feminen",
        new String[]{"red", "black", "gold", "white", "hot pink"},
        new String[]{"satin", "silk", "lace", "sheer", "glossy"},
        new String[]{"strap top","bodycon top","corset top"},
        new String[]{"mini skirt","fitted pants","slit skirt"},
        new String[]{"heels","strappy sandals"},
        new String[]{"bold earrings","clutch","gold bangles"}
    ),

    AFROBEAT(
        "özgür, ritmik",
        new String[]{"orange", "green", "yellow", "black", "white"},
        new String[]{"linen", "cotton", "printed fabric", "crochet", "light denim"},
        new String[]{"flowy shirt","printed top","tank"},
        new String[]{"wide pants","shorts","relaxed jeans"},
        new String[]{"sneakers","sandals"},
        new String[]{"beaded accessories","statement print","crossbody bag"}
    ),

    ARABESK(
        "melankolik, güçlü",
        new String[]{"black", "burgundy", "deep brown", "gold", "cream"},
        new String[]{"velvet", "satin", "leather", "crepe", "lace"},
        new String[]{"dramatic blouse","long coat top","lace top"},
        new String[]{"dark skirt","tailored pants","long dress bottom"},
        new String[]{"boots","classic heels"},
        new String[]{"dramatic scarf","gold details","structured bag"}
    ),
    
    CHRISTMAS(
    	"festive, cozy, sparkle",
    	new String[]{"red","green","gold","white","silver"},
    	new String[]{"knit","velvet","satin","faux fur","sequins"},
    	new String[]{"chunky knit sweater","red turtleneck","sparkly top"},
    	new String[]{"black pants","pleated skirt","red mini skirt"},
    	new String[]{"boots","classic heels","sneakers"},
    	new String[]{"statement earrings","gold jewelry","hair bow","mini bag"}
    );

    public final String vibe;
    public final String[] colors;
    public final String[] textures;
    
    public final String[] tops;
    public final String[] bottoms;
    public final String[] shoes;
    public final String[] accessories;

    MusicGenre(String vibe, String[] colors, String[] textures,
            String[] tops, String[] bottoms, String[] shoes, String[] accessories) {
        this.vibe = vibe;
        this.colors = colors;
        this.textures = textures;
        this.tops = tops;
        this.bottoms = bottoms;
        this.shoes = shoes;
        this.accessories = accessories;
    }
}

