ModsDotGroovy.make {
    modLoader = 'javafml' // The mod loader of the mod
    loaderVersion = '[43,)' // The version of the modloader the mod is compatible with
    
    license = 'MIT' // The license of the mod
	displayURL="https://www.curseforge.com/minecraft/mc-mods/dramatic-doors"
    issueTrackerUrl = 'https://github.com/Kitteh6660/DramaticDoors/issues'

    mod {
        modId = rootProject.mod_id // The ID of the mod
        displayName = rootProject.mod_name // The name of the mod
        version = rootProject.mod_version // The version of the mod. `this.version` refers to the `version` property in your gradle.properties file
        
        description = """
		Doors that are barely tall enough to fit your player ... ?
		Doors that suffocate you when you ride ol' Blackjack the horse through? Enderman discrimination? Seriously?
		... PAH!!

		Can we not have intrigue?  Whatever happened to the tender grace and elegance of a nice tall door? Where is the drama?!?
		Here. I have it. And now you can too.

		Gone are the ways of the past - with the new Dramatic Doors mod!

		With the modern era of innovations comes a new door type: the tall door and the short door.
		These 3-block-high doors come in every vanilla variety;
		Iron, Oak, Spruce, Birch, Acacia, Dark Oak, Jungle, Crimson, Warped, Mangrove! And in 1.20, the all-new Bamboo and Cherry!
		Craft one by putting 3 of the vanilla variant vertically in a crafting table.
		
		Short doors can be crafted by using the regular doors in stonecutter or with Woodworks installed: the sawmill for wooden doors.
		
		Now supports over 80 mods across Forge and Fabric!
        """ // A multiline description of the mod
        authors = [ 'Fizzware', 'Kitteh6660' ] // A list containing the authors of the mod
        logoFile = "icon.png" // A file name (in the root of the mod JAR) containing a logo for display. Optional
        
        dependencies {
            forge = "[43.2.0,)" // The Forge version range the mod is compatible with
            minecraft = "[1.19.2, 1.19.3]" // The Minecraft version range the mod is compatible with

            mod('morecraft') {
                mandatory = false
                versionRange = "[1.19.2-5.0,)"
            }
            mod('mcwdoors') {
                mandatory = false
                versionRange = "[1.1.0,)"
            }
        }
    }
}