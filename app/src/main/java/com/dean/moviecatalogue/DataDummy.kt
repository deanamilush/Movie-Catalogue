package com.dean.moviecatalogue

import com.dean.moviecatalogue.movies.MoviesData
import com.dean.moviecatalogue.tv.TvShowsData

object DataDummy {

    fun generateDummyMovies(): List<MoviesData> {

        val movies = ArrayList<MoviesData>()

        movies.add(
            MoviesData(
            "Glass (2019)",
            "Thriller, Drama, Science Fiction",
            R.drawable.poster_glass,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "M. Night Shyamalan")
        )
        movies.add(
            MoviesData(
            "How to Train Your Dragon (2010)",
            "Fantasy, Adventure, Animation, Family",
            R.drawable.poster_how_to_train,
            "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father",
            "Dean DeBlois")
        )
        movies.add(
            MoviesData(
            "Avengers: Infinity War (2018)",
            "Adventure, Action, Science Fiction",
            R.drawable.poster_infinity_war,
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Joe Russo")
        )
        movies.add(
            MoviesData(
            "Master Z: Ip Man Legacy (2018)",
            "Action",
            R.drawable.poster_master_z,
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            "Yuen Woo-ping")
        )
        movies.add(
            MoviesData(
            "Mortal Engines (2018)",
            "Adventure, Science Fiction",
            R.drawable.poster_mortal_engines,
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "Christian Rivers")
        )
        movies.add(
            MoviesData(
            "Overlord (2018)",
            "Horror, War, Science Fiction",
            R.drawable.poster_overlord,
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "Julius Avery")
        )
        movies.add(
            MoviesData(
            "Ralph Breaks the Internet (2018)",
            "Family, Animation, Comedy, Adventure",
            R.drawable.poster_ralph,
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "Phil Johnston")
        )
        movies.add(
            MoviesData(
            "Robin Hood (2018)",
            "Adventure, Action, Thriller",
            R.drawable.poster_robin_hood,
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "Ben Chandler")
        )
        movies.add(
            MoviesData(
            "Serenity (2019)",
            "Thriller, Mystery, Drama",
            R.drawable.poster_serenity,
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "Steven Knight")
        )
        movies.add(
            MoviesData(
            "T-34 (2018)",
            "War, Action, Drama, History",
            R.drawable.poster_t34,
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            "Alexey Sidorov")
        )

        return movies
    }

    fun generateDummyTvShows(): List<TvShowsData> {

        val tvShows = ArrayList<TvShowsData>()

        tvShows.add(
            TvShowsData(
                "Marvel's Iron Fist (2017)",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                R.drawable.poster_iron_fist,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "Scott Buck"
            )
        )
        tvShows.add(
            TvShowsData(
                "Naruto Shippūden (2007)",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                R.drawable.poster_naruto_shipudden,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "null"
            )
        )
        tvShows.add(
            TvShowsData(
                "NCIS (2003)",
                "Crime, Action & Adventure, Drama",
                R.drawable.poster_ncis,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "Donald P. Bellisario"
            )
        )
        tvShows.add(
            TvShowsData(
                "Riverdale (2017)",
                "Mystery, Drama, Crime",
                R.drawable.poster_riverdale,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "Roberto Aguirre-Sacasa"
            )
        )
        tvShows.add(
            TvShowsData(
                "Shameless (2011)",
                "Drama, Comedy",
                R.drawable.poster_shameless,
                "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                "Paul Abbott"
            )
        )
        tvShows.add(
            TvShowsData(
                "Supergirl (2015)",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                R.drawable.poster_supergirl,
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "Greg Berlanti, Ali Adler, Andrew Kreisberg"
            )
        )
        tvShows.add(
            TvShowsData(
                "Supernatural (2005)",
                "Drama, Mystery, Sci-Fi & Fantasy",
                R.drawable.poster_supernatural,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "Eric Kripke"
            )
        )
        tvShows.add(
            TvShowsData(
                "The Simpsons (1989)",
                "Family, Animation, Comedy\n",
                R.drawable.poster_the_simpson,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Matt Groening"
            )
        )
        tvShows.add(
            TvShowsData(
                "The Umbrella Academy (2019)",
                "Action & Adventure, Sci-Fi & Fantasy, Drama\n",
                R.drawable.poster_the_umbrella,
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "Steve Blackman"
            )
        )
        tvShows.add(
            TvShowsData(
                "The Walking Dead (2010)",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                R.drawable.poster_the_walking_dead,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "Frank Darabont"
            )
        )

        return tvShows
    }
}