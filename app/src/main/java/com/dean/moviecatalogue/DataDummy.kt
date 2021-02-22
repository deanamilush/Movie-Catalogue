package com.dean.moviecatalogue

object DataDummy {

    fun generateDummyCourses(): List<MoviesData> {

        val movies = ArrayList<MoviesData>()

        movies.add(MoviesData(
            "Glass (2019)",
            "Thriller, Drama, Science Fiction",
            R.drawable.poster_glass,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "M. Night Shyamalan"))
        movies.add(MoviesData(
            "How to Train Your Dragon (2010)",
            "Fantasy, Adventure, Animation, Family",
            R.drawable.poster_how_to_train,
            "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father",
            "Dean DeBlois"))
        movies.add(MoviesData(
            "Avengers: Infinity War (2018)",
            "Adventure, Action, Science Fiction",
            R.drawable.poster_infinity_war,
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Joe Russo"))
        movies.add(MoviesData(
            "Master Z: Ip Man Legacy (2018)",
            "Action",
            R.drawable.poster_master_z,
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            "Yuen Woo-ping"))
        movies.add(MoviesData(
            "Mortal Engines (2018)",
            "Adventure, Science Fiction",
            R.drawable.poster_mortal_engines,
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "Christian Rivers"))
        movies.add(MoviesData(
            "Overlord (2018)",
            "Horror, War, Science Fiction",
            R.drawable.poster_overlord,
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "Julius Avery"))
        movies.add(MoviesData(
            "Ralph Breaks the Internet (2018)",
            "Family, Animation, Comedy, Adventure",
            R.drawable.poster_ralph,
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "Phil Johnston"))
        movies.add(MoviesData(
            "Robin Hood (2018)",
            "Adventure, Action, Thriller",
            R.drawable.poster_robin_hood,
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "Ben Chandler"))
        movies.add(MoviesData(
            "Serenity (2019)",
            "Thriller, Mystery, Drama",
            R.drawable.poster_serenity,
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "Steven Knight"))
        movies.add(MoviesData(
            "T-34 (2018)",
            "War, Action, Drama, History",
            R.drawable.poster_t34,
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            "Alexey Sidorov"))

        return movies
    }
}