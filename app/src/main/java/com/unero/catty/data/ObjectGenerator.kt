package com.unero.catty.data

import com.unero.catty.R

object ObjectGenerator {
    private val catBreeds = arrayOf(
        "Scottish Fold",
        "LaPerm",
        "Chartreux",
        "Persian",
        "Japanese Bobtail",
        "Siamese",
        "Pixiebob",
        "Bengal",
        "American Shorthair",
        "Munchkin",
        "Balinese-Javanese"
    )

    private val catThumbnails = arrayOf(
        R.drawable.cat1_1,
        R.drawable.cat2_1,
        R.drawable.cat3_1,
        R.drawable.cat4_1,
        R.drawable.cat5_1,
        R.drawable.cat6_1,
        R.drawable.cat7_1,
        R.drawable.cat8_1,
        R.drawable.cat9_1,
        R.drawable.cat10_1,
        R.drawable.cat11_1,
   )

    private val catPhotos = arrayOf(
        arrayOf(R.drawable.cat1_1, R.drawable.cat1_2, R.drawable.cat1_3),
        arrayOf(R.drawable.cat2_1, R.drawable.cat2_2),
        arrayOf(R.drawable.cat3_1, R.drawable.cat3_2),
        arrayOf(R.drawable.cat4_1, R.drawable.cat4_2),
        arrayOf(R.drawable.cat5_1, R.drawable.cat5_2),
        arrayOf(R.drawable.cat6_1, R.drawable.cat6_2, R.drawable.cat6_3),
        arrayOf(R.drawable.cat7_1, R.drawable.cat7_2, R.drawable.cat7_3),
        arrayOf(R.drawable.cat8_1, R.drawable.cat8_2),
        arrayOf(R.drawable.cat9_1, R.drawable.cat9_2),
        arrayOf(R.drawable.cat10_1, R.drawable.cat10_2),
        arrayOf(R.drawable.cat11_1, R.drawable.cat11_2),
    )

    private val catSizes = arrayOf(
        "Medium with males weighing 9 to 13 pounds and females 6 to 9 pounds",
        "Medium, with males weighing from 7 to 10 pounds and females weighing from 5 to 8 pounds",
        "Medium to large, with males weighing 10 to 15 pounds and females weighing 6 to 11 pounds",
        "Medium to large, with males weighing 9 to 14 pounds and females weighing 7 to 11 pounds",
        "Medium, with males weighing 7 to 10 pounds and females weighing 5 to 7 pounds",
        "Medium, with males weighing 11 to 15 pounds and females weighing 8 to 12 pounds",
        "Medium to large, with males weighing 12 to 17 pounds and females weighing 8 to 12 pounds",
        "Medium to large with males: 10 to 18 pounds and females: 6 to 12 pounds",
        "Medium to large, with males weighing 11 to 15 pounds and females weighing 8 to 12 pounds",
        "Medium to large, with males weighing 11 to 15 pounds and females weighing 8 to 12 pounds",
        "Medium, Male: 12 to 16 pounds, Female: 8 to 12 pounds"
    )

    private val catOverviews = arrayOf(
        "The smart and friendly Scottish Fold loves playing with challenging, puzzling toys to test her intelligence. She also loves human interaction with her people and loves attention. Scottish Folds prefer the company of their humans or other cats (or cat-friendly dogs), rather than being left alone for hours at a time.",
        "Distinguished by her curly, rippled coat and people-oriented personality, the LaPerm is calm and friendly, yet at other times energetic and inquisitive. This feline thrives on attention and likes to be close to her human companions. Though curious, this breed is content to be a lap cat and close to whatever is going on. The LaPerm blossoms with a loving family.",
        "Often called the smiling cat of France, the Chartreux has a sweet, smiling expression. This sturdy, powerful cat has a distinctive blue coat with a resilient wooly undercoat. Historically known as fine mousers with strong hunting instincts, the Chartreux enjoys toys that move. This is a slow-maturing breed that reaches adulthood in three to five years. A loving, gentle companion, the Chartreux forms a close bond with her family.",
        "The docile Persian is a quiet feline who enjoys a calm and relaxing environment. Although she enjoys sitting in her humans’ laps and being pet, she’s just as happy to sit and observe everyone’s comings and goings from afar. Persians are independent and selective in who they show affection to.",
        "One of the oldest cat breeds, the Japanese Bobtail is believed to bring good luck and prosperity. The two coat varieties, longhair and shorthair, are exactly the same except for coat length. This delightfully mischievous feline enjoys a good game of fetch and likes to carry things in her mouth. A healthy breed that lives an average of 15 to 18 years, the Japanese Bobtail is social and particularly good with children.",
        "Siamese Cats are incredibly social, intelligent and vocal—they’ll talk to anyone who wants to listen, and even those who don’t. They also play well with other cats, dogs and children. In fact, they thrive on companionship, so it’s a good idea to get them a playmate to interact with throughout the day. Although they’re active and curious, they also love curling up on their human’s lap or snuggling up next to them in bed.",
        "A muscular, brawny cat that resembles the wild Coastal Red Bobcat found in the Pacific Northwest, the Pixiebob has the loving personality of a domestic cat. This active, intelligent feline is often called a dog in disguise because she can be taught to fetch and walk on a leash. The Pixiebob is an easygoing, relaxed cat that is a loving companion for children and enjoys other pets.",
        "Bengal Cats are curious and confident with the tameness of a domestic tabby and the beauty of an Asian Leopard Cat. Learn more about Bengals and their playful personality, plus information on their health and how to feed them.",
        "Formerly used to keep rodents and vermin away from food stores, the American Shorthair still enjoys exercising her hunting skills on unsuspecting insects. As a smart, moderately active feline, she enjoys learning tricks and challenging her intelligence with puzzles and interactive toys.",
        "They may have short legs, but Munchkin Cats don’t let it hold them back. Although they can’t make big leaps like other breeds, they can make small jumps, climb and even sit back on their haunches to get a better look at something.",
        "The Balinese, also known as Javanese depending on coat color and pattern, is regal and aristocratic in appearance, but a curious kitten at heart."
    )

    private val catHistories = arrayOf(
        """
            Every Scottish Fold can trace her heritage back to a barn cat named “Susie”. She was a white cat with unique, folded ears, working as a mouser in a barn in the Tayside region of Scotland. She got the attention of William Ross, a shepherd, in 1961. He was given one of Susie’s kittens and named her “Snooks”.

            When Snooks eventually had kittens, one of the males was bred with a British Shorthair, which began the breed’s development. The mutated gene that results in the folded ears is dominant, so it produces the trademark ear folds about 50 percent of the time. In addition to this gene, Susie also passed down a gene for long hair. Longhaired cats are known as “Highland Folds” with some cat associations.

            Scottish Folds weren’t imported to the United States until the Early 1970s. By the mid 70s, they were recognized by most cat associations throughout North America.
        """.trimIndent(),
        "N/A",
        "N/A",
        """
            Persian Cats originated in Mesopotamia, which later became Persia and is now modern-day Iran. Their soft features and docile personality attracted the attention of Pietro Della Valle, an Italian nobleman who is credited with bringing these felines to Europe in the 17th century. The Persian kitty was a favorite of Queen Victoria and the breed was imported to the U.S. in the late 19th century.
        """.trimIndent(),
        "N/A",
        """
            The Siamese Cat originated in Siam (now Thailand) and was not exported until the late 19th century. In 1878, U.S. President Rutherford B. Hayes and his wife received one of these exotic felines as a gift. In 1906, she was officially recognized as a breed by the Cat Fanciers Association (CFA). The Siamese has contributed to the creation of several other breeds, including Himalayan, Burmese, Balinese and more
        """.trimIndent(),
        "N/A",
        """
            The Bengal Cat is a hybrid of a domestic cat with the wild Asian Leopard Cat. The first crossbreed was performed by Jean Mill in 1963, but the hybrid wasn’t perfected until the mid-1980s. Today, Bengals are bred only with each other.
        """.trimIndent(),
        """
            American Shorthairs may have descended from other domestic shorthairs brought over on the Mayflower in 1620, or even earlier by the first settlers of Jamestown or even Spanish explorers in Florida. A 1634 publication credits these domestic shorthairs with saving New England crops from squirrels and chipmunks. They were exhibited at the first U.S. cat show in 1895 and Cat Fanciers Association (CFA) recognized them as a founding breed in 1906.
        """.trimIndent(),
        """
            The first reports of cats with a genetic mutation causing short legs date back to the 1930s and 40s, but there was no trace of Munchkins throughout World War II. They resurfaced in the 1950s and 70s before being officially established as a breed in 1983.

            In 1994, The International Cat Association (TICA) accepted the cat into their new breed development program, and they achieved championship status in 2003. The Cat Fanciers Association (CFA) and American Cat Fanciers Association (ACFA) still do not recognize the Munchkin as a breed.
        """.trimIndent(),
        """
            The generally accepted explanation for the origin of this breed is a natural mutation for long hair in the Siamese cat breed. In fact, this coat length is the primary difference between the Balinese and Siamese.

            Although longhaired Siamese kittens had certainly been making occasional appearances in litters, the first real breeding program for this breed didn’t begin until the 1950s.
        """.trimIndent()
    )

    val catList: ArrayList<Cat>
        get() {
            val list = arrayListOf<Cat>()
            for (position in catBreeds.indices) {
                val cat = Cat(
                    catBreeds[position],
                    catThumbnails[position],
                    catPhotos[position],
                    catSizes[position],
                    catOverviews[position],
                    catHistories[position]
                )
                list.add(cat)
            }
            return list
        }

}