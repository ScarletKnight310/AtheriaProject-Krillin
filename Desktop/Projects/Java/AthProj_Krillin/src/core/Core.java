package core;

import content.*;
import base.*;

public class Core 
{ 
	public Genders genders;
	public Races races;
	public Classes classes;
	public NPCs npcs;//
	public Origins origins;
	public Jobs jobs;
	public Traits traits;
	// equipment
	
	public Core(boolean AtheriaDef) 
	{
		if(AtheriaDef)
		{	
			// inti equipment
			
			
			// inti traits
			traits = new Traits(new AthObject[]
			{
				// Race Boons
				new AthObject("Wealth",
						"Being from a nation with a booming economy has its perks. Add half of your last occupation’s gill count to your total gill",
						new Stat("moreGil",2)),
				new AthObject("Scale Refraction",
						"Because of the way the playlets in the Volx’s skin formed they can alter their color scheme rendering them effectively invisible to the naked eye. At least for most Adar. " + 
						"(Those with an intelligence score of 30 or higher will be able to know the general direction of a Volx. With 50 or higher the Refraction is rendered useless) "),
				new AthObject("Infrared",
						"Volx are able to switch the way their eye perceives information allowing them to see infrared. This lets them see each other when they turn invisible. (This also means using Refraction on a fellow Volx is futile)"),
				new AthObject("Common",
						"The humanity’s greatest advantage is its population and diversity, as such you would be hard pressed to find any place on the planet that didn’t have more than a few humans mucking about. There are huge advantages in being in the majority in a racist society. Humans are the only race that isn’t bilingual, however this isn’t too much of a problem because the international language of business (meaning it is taught and spoken all across the globe) is hurisk (the human language), also known as common."),
				new AthObject("Educated",
						"Elven society takes pride in its education system. Even the poorest of Elves are given a higher level of education than most Adar on the planet. You gain the ability of being Trilingual (all races are bilingual except human; can speak their native tongue and common) and can pick a third language to speak.",
						new Stat("INT",2)),
				new AthObject("Custom Body",
						"You get to choose how you were built. Your design, shape, and size is up to you (limitations are applied based on your ending stats)"),
				new AthObject("Immune",
						"Because of the way the immunity system of an orc functions an orc cannot get sick or poisoned by conventional means. There homeland is steeped in radiation, but it has no effect on them, however if any other of the Adar try and settle there they must live in shelters and wear gas masks in order to keep themselves from suffering from radiation poisoning."),
				new AthObject("Water Breathing",
						"Zeverin can breath under water, but can’t breath on land without their water tanks."),
				new AthObject("Free Suit","Because they require both the water tanks and legs all Zeverin must have a special suit of armor that accommodates these needs." + 
						"Take : suit free (enhancement suits can be built to fit these specifications) you can sell the suit for it’s full price, but you will not be able to survive on land without some sort of suit (be it enhanced or not)",
						new Stat("Item_Temp",123)),
				// Boons
				new AthObject("Well",
						"You were born with a massive gift for magic. Instead of drawing magic from your own internal mana stores, you draw mana from godly realms also known as ‘The Wells.’ However, due to this massive amount of mana that is constantly coursing through your body you suffer from hallucinations.",
						new Stat("INT",4)),
				new AthObject("Possession",
						"You have been possessed by a demon from Sleith’s realm. It times of great duress the demon will rip through your body and wreak havoc on all things around it. In some cases if you are unable to hold it back this can be a friend. The demons traits are based on the the element from the god you picked.",
						new Stat("ANYONE",2)),
				new AthObject("Lycanthropy",
						"You have been cursed by Kyna for your actions against nature, whatever they may be. While you are alive you gain massive bonuses based on the animal she cursed you with (in some cases this can show up in physical traits as with Centaurs).  However, the most common curse is using wolfs blood. This grants huge bonuses in your strength, dex, speed, as well as your perception. However, when you do die the beast will take over an terrorize the land, with you still trapped inside.",
						new Stat[] {
							new Stat("STR",2),
							new Stat("INT",2),
							new Stat("SPD",2),
							new Stat("DEX",2),}),
				new AthObject("Cybernetic",
						"One body part is replaced by a mechanical piece. You may pick the body part, and the effects of the piece. " + 
						"Note: can be taken multiple times",
						new Stat("ANYONE",2)),
				new AthObject("Companion",
						"You may have an Ark slave (“friend”) or animal companion. You can pick the type of animal (as long as it’s no bigger than a horse). If you pick an Ark it can carry one weapon as well as one of the following boons (Medic, Pilot, or Tracker)"),
				new AthObject("Medic",
						"You gain the knowledge that will allow you to heal  others as well as yourself. Be it from magic, miracles, herbs, or medication. No matter you intelligence, mana, or faith you can not help someone without this knowledge.", 
						new Stat("INT", 2)),
				new AthObject("Pilot",
						"You gain the ability to pilot all kinds of vehicles (cars not included because it is common knowledge). No matter your intelligence you cannot do something you don’t know how to do.", 
						new Stat("DEX", 2)),
				new AthObject("Learned",
						"With time and effort you practiced honing certain skills in order to become a more effective member of the team. Note: " + 
						"Can be taken as many times as you’d like",
						new Stat("ANYONE",4)),
				new AthObject("Tracker",
						"You gain the knowledge of living in the wilds and tracking pray. This trait also counters a Volxs invisibility traite. No matter your intelligence you cannot do something you don’t know how to do. ", 
						new Stat("SPD", 2)),
				new AthObject("Demigod","The god that you picked is now one of your parents. You now gain a godly ability, this is dependent on the god the you chose. For example if you picked Hytherion you can restart time (an encounter) once a day, or if you picked Edoria you can now teleport to any location in sight. Doubles the points you receive from your god."),
				// Drawback
				new AthObject("Hesitant",
						"You are a coward at heart. No matter you speed, in any encounter, you will go last. This is because your fear of death."),
				new AthObject("Cursed",
						"For some reason monsters are naturally drawn to you. Because of this if you stay in one place for too long it will be overrun by beasts, and those deaths will be on your hands. In addition to this monsters have a tendency to target you first."),
				new AthObject("Addiction",
						"You are addicted to some vice, this vice must be frowned upon by society. For example, it can be drugs, violence, or sex."),
				new AthObject("Hallucinations",
						"Certain events trigger you to sense/perceive something that is not really there. The most common sense affected is smell/taste, then hearing, then sight, and finally touch. In extreme cases your character will experience all at the same time."),
				new AthObject("Hunted",
						"Somehow you managed to piss of a person or organization, and they have sent a deadly assassin, or assassins to see to your demise. If you pick a person this counts as one drawback, but if you pick an organization it will count as two. " + 
						"Note: the organization will be extremely powerful"),
				// Extra
				new AthObject("Robo Boxer",
						"Because of your time spent in the ring, you are now extremely talented when it comes to matters of the fist. While this by no accounts make you as deadly as you would be with a weapon. This will be extremely useful when you find yourself unarmed. " + 
						"For the cost of one boon point you held the title of grand champion just before you left the ring. You are now just as deadly with your fists as you would be with any melee weapon."),
				new AthObject("Vampirism",
						"2000 years ago you sold your soul to Sleith for power and false immortality. You gain for forms.\n" + 
						"[Daywalker: You are always in this form during the day. You are no stronger or nor faster than your normal self.]\n" +  
						"[NightStalker: You are in this form at night unless you change forms. You are twice as strong and fast as you would be in Daywalker form ]\n" + 
						"[Vampire: In a fit of rage or hunger you will change into Vampire form you are twice as strong and fast as you would be in Nightstalker form.]\n" +
						"[Demon: In absolut dire situations the demon will rip its way from your body, It is twice as strong and fast as your vampire form, but you have no control over it.]\n" +   
						"[Note: If Sleith gives you an order you must follow it, as you are not capable of refusing.] \n" + 
						"The only way to kill you is by magic, holy weapons, and suicide. If you drop to zero health from a regular weapon you will be rendered unconscious until the next night. There is a temporary reduction to all your stats.")
			},
			new Integer[]
			{
				0,// dwarf boon
				0,// volx boons
				0,
				0,// human boon
				0,// ark boon
				0,// elf boon
				0,// orc boon
				0,// zeverin boons
				0,
				-2,// Boons
				-1,
				-2,
				-1,
				-1,
				-1,
				-1,
				-1,
				-1,
				-3,
				1, // Drawbacks
				1,
				1,
				1,
				1,
				0,// Extra
				-2
			});
			
			// inti genders
			genders = new Genders(new AthObject[] 
			{
					new AthObject("Male",
							"You are a generic stereotypical Man",
							new Stat[] {
									new Stat("STR", 2),
									new Stat("END", 2),
									new Stat("SPD", 2),
									new Stat("CON", 2),
									new Stat("WIS", 2)
							}),
					new AthObject("Female",
							"You are a generic stereotypical Woman",
							new Stat[] {
									new Stat("INT", 2),
									new Stat("CHR", 2),
									new Stat("DEX", 2),
									new Stat("CAS", 2),
									new Stat("CRA", 2)
							}),
					new AthObject("Other",
							"You are something other than a generic male or female character.",
							new Stat("ANY", 10)
							)
			});
			
			// inti races 
			races = new Races(new AthObject[]
			{
				new AthObject("Dwarf",
						"Dwarfs value innovation above all else, and have developed technological marvels the rest of the Adar have trouble comprehending. Chief of which are the vessels that house the Arc slaves. Typically a dwarf only acts for reward or need and has little interest in anything that does not follow or suit their logic. The Federation is an economic powerhouse that pours billions into weapons of war. There are few things on Atheria that can rival the might of a Durralian Class Airship.",
						new Stat[] 
						{
							new Stat("STR",7),
							new Stat("END",4),
							new Stat("INT",5),
							new Stat("CHR",4),
							new Stat("DEX",4),
							new Stat("CAS",3),
							new Stat("WIS",3),
							new Stat("SPD",2),
							new Stat("CON",7),
							new Stat("CRA",10),
							new Stat("Trait","Wealth".hashCode())
						}),
				new AthObject("Volx",
						"The volx are a peaceful folk that value solitude and the forest. Interestingly enough, if one were to look close enough at their skin they would notice interlocking plates similar in nature to a soft scales. These tiny plates can copy surrounding colors  effectively making the volxs appear invisible. This unique trait makes for extremely efficient and lethal assassins. Even marching for war the Volx armies are practically untraceable. However, when the volx do want to be seen they keep their skin a specific color, typically black in the day and white at night.",
						new Stat[] 
						{
							new Stat("STR",5),
							new Stat("END",3),
							new Stat("INT",5),
							new Stat("CHR",5),
							new Stat("DEX",13),
							new Stat("CAS",4),
							new Stat("WIS",3),
							new Stat("SPD",12),
							new Stat("CON",2),
							new Stat("CRA",3),
							new Stat("Trait","Scale Ref// Class Score Limits\n" + 
									"	private static int Limit = 5;raction".hashCode()),
							new Stat("Trait","Infrared".hashCode())
						}),
				new AthObject("Human",
						"Humanity, the most dominant and prevalent of the Adar. Upon first glance humans may appear weak, slow, and in most cases not particularly intelligent. However, their strength resides in each other. Since humans vary so vastly they are able to account for any and all weaknesses. This strength is emphasized by humanity’s massive population which accounts for a third of the population of Atheria. After the Great War Humanity seized its opportunity and became the most powerful nation in Atheria. Humanity’s economy now rivals the dwarfs, their military might would crush the Orcs of old, and its influence stretches further than the elves ever did.",
						new Stat[] 
						{
							new Stat("ALL",5),
							new Stat("Trait","Common".hashCode())
						}),
				new AthObject("Elf",
						"Before the war the elves were the most powerful of the Adar. The Elven Empire's influence stretched across the continents, however after its crushing defeat the Empire is a shadow of its former self. In Order to live an elf needs magic and because of this most elves will have several stillborn children before having a child. With the failure of the war, less Elves are being gifted with magic which has resulted in a severe drop in population. Luckily due to their natural affinity to magic they are still at the top of any and all magical research  and development. Now the Elves hope to find a way to breed children through the use of artificial magic.",
						new Stat[] 
						{
							new Stat("STR",5),
							new Stat("END",3),
							new Stat("INT",7),
							new Stat("CHR",6),
							new Stat("DEX",4),
							new Stat("CAS",15),
							new Stat("WIS",2),
							new Stat("SPD",4),
							new Stat("CON",2),
							new Stat("CRA",3),
							new Stat("Trait","Educated".hashCode())
						}),
				new AthObject("Ark",
						"The Ark are a collection of millions upon millions of souls trapped inside crystal. These crystals can be fused with machine to create machines with souls. These machines were and are enslaved by all the other races of the Adar, however some have either escaped or been granted their freedom and now live on a massive floating city called the Ark. Arks minds are incredibly malleable which makes Arks extremely innocent in the early stages of their lives. This is because upon being awoken they have the mind of an infant but the capabilities of a full grown adult. Enslaved Arks have a lifespan of no more than 8 years and are quickly demolished and replaced.",
						new Stat[] 
						{
							new Stat("ANY",57),
							new Stat("CAS",3),
							new Stat("WIS",3),
							new Stat("Trait","Custom Body".hashCode())
						}),
				new AthObject("Orc",
						"The Orc are an honorable race or warriors who value courage, commitment, sacrifice, and strength. They only keep what is useful and are honest to a fault. They devote the entirety of their lives to a single duty so the are absolutely perfect at it. All orcs can fight and are prone to fighting each other for fun, however when fighting for something they believe in they would gladly give their life for an orc they hate. More importantly however, they would live for the orcs they love. The opening attack by the elves back in the Great War was unleashing 7 nuclear bombs on the orcs. This was to meant take them out of the war completely. However, this infuriated them to the point where they were willing to fight to extinction if that meant the elves would lose their campaign, luckily this was not the case. The orcs have an almost infallible immunity system allowing them to live in their radiation infested lands, however nothing else can leaving the orcs with little to no food left. The orcs may be forced into extinction yet.",
						new Stat[] 
						{
							new Stat("STR",8),
							new Stat("END",5),
							new Stat("INT",5),
							new Stat("CHR",5),
							new Stat("DEX",3),
							new Stat("CAS",3),
							new Stat("WIS",4),
							new Stat("SPD",8),
							new Stat("CON",7),
							new Stat("CRA",2),
							new Stat("Trait","Immune".hashCode())
						}),
				new AthObject("Zeverin",
						"Born in the sea the Zeverin require mechanized suits crafted by the dwarfs to walk on land. Having an extremely malleable lower half. Their 6 tentacles can fit in small compartments within their suits. In addition to not being able to walk on land they cannot breathe air either and require water rebreathers which need to be changed regularly. With their heavy suits and high bone density the Zeverin are easily the strongest and toughest of all the Adar, however they are also the slowest. Culturally only the very young and old live in Zeverin cities (there are only three on the planet). Once old enough a Zeverin will join a Nomadic tribe only stopping at cities to mate and give birth or when they are too old to be an effective member of the tribe. ",
						new Stat[] 
						{
							new Stat("STR",8),
							new Stat("END",8),
							new Stat("INT",3),
							new Stat("CHR",6),
							new Stat("DEX",2),
							new Stat("CAS",4),
							new Stat("WIS",7),
							new Stat("SPD",3),
							new Stat("CON",12),
							new Stat("CRA",2),
							new Stat("Trait","Water Breathing".hashCode()),
							new Stat("Trait","Free Suit".hashCode())
						}),
			},
			new AthObject[][]
			{
				new AthObject[] //dwarf
				{
					new AthObject("Baron",
							"Slightly taller and far more stout than their fellow dwarfs, Baron dwarfs tend to make up most of the combat units in the federation. While still remarkably talented at crafting their true strength lies with there strong bodies and ability to survive in low oxygen environments. Baron dwarfs not serving in combat units tend to make remarkable miners.",
							new Stat[] {
								new Stat("STR",3),
								new Stat("CON",3),
								new Stat("CRA",-1)
					}),
					new AthObject("Holathen",
							"Holathen dwarfs live in a far more comfortable environment then their Baron Dwarven brethren; because of this they are far more sociable than their Ganon cousins. They have a tendency to go without shoes because of their heavily calloused feet, and as such are incredibly stealthy and light on their feet.",
							new Stat[] {
								new Stat("CHR",4),
								new Stat("DEX",4),
								new Stat("SPD",2),
								new Stat("STR",-3),
								new Stat("CON",-2)
							}),
					new AthObject("Ganon",
							"Ganon dwarfs rarely leave their workshops and when they do it’s usually to test their new inventions. Most of the Federations greatest inventions have come from a Ganon mind; this may be due to their antisocial nature. It is often easier for a Ganon to understand advanced machinery or complex chemistry than it is to understand social cues.",
							new Stat[] {
								new Stat("INT",5),
								new Stat("CRA",5),
								new Stat("CHR",-1),
								new Stat("STR",-2),
								new Stat("END",-2)
							}),
				},
				new AthObject[] //volx
				{
					null
				},
				new AthObject[] //human
				{
					new AthObject("House Aqueous",
							"The seafaring nation of Era was founded on freedom and dreams. Dreamers, adventures, and outcasts from all human nations flock to Era often running to or away from something. Most Eran switch from charming and suave to rude and and armed quite quickly. Era has few laws and even fewer people who follow them. Yet everyone respects The Code, those that don’t are strapped to the front of a cannon and forced to watch their entrails fly across the 8 seas.",
							new Stat[] {
									new Stat("DEX",3),
									new Stat("SPD",2),
									new Stat("CHR",1),
									new Stat("WIS",-1)
									
							}),
					new AthObject("House Fumous",
							"The nation of Furra is steeped with a history of war and conquest. Once long ago, Furra was the seat of the High King. Heath Fumous, the first High King of Man, lead a long a bloody conquest over the lands of man. This lead to a long lasting dynasty that eventually fell due to famine and civil war. With the throne empty House Heart seized its opportunity. The people of Furra value action over words and await for a ruler who is willing to reclaim the throne. They have a saying \"Glory before honor\"",
							new Stat[] {
									new Stat("STR",3),
									new Stat("CON",1),
									new Stat("END",1)
							}),
					new AthObject("House Snowden",
							"The people of winter have little use for a standard education and any sort of advanced technology. Technology never seems to work in the harsh environment, and school tends to be a waste of time when you could die at any moment. Most people from Senora are highly self religent and tend to disregard the opinions of those who have no experience living in a frozen waste. " + 
							"That being said they also value " + 
							"respect, honor, and family above " + 
							"all else. It is a rare sight to see a " + 
							"Senoran be emotive, because " + 
							"showing emotions is showing " + 
							"weakness, and weakness gets " + 
							"you and those you love killed." + 
							"",
							new Stat[] {
									new Stat("CON",4),
									new Stat("STR",1)
							}),
					new AthObject("House Heart",
							"The people of Hearth pride themselves in tradition, elegance, and wealth. For the nobility a beautiful exterior often hides an ugly interior. For the less fortunate members of Hearth society there is a fierce struggle for any status they can grasp. People from here will speak kindly and yet still look down on the savage men from other realms.",
							new Stat[] {
									new Stat("INT",3),
									new Stat("CAS",5),
									new Stat("CHR",2),
									new Stat("CON",-2),
									new Stat("END",-1),
									new Stat("STR",-1),
									new Stat("SPD",-1)
							}),
					new AthObject("House Sagir",
							"The People of Agrah live for the gods, and produce most of Atheria’s most powerful priests. Because of the harsh conditions of the desert the Agrans are very harsh themselves. They tend to be slow to trust and and quick to anger. However, when one does gain that trust they have a friend and ally for life.",
							new Stat[] {
									new Stat("WIS",5),
									new Stat("CRA",1),
									new Stat("CAS",-1)
							}),
					new AthObject("House Taurus",
							"The people of Taura value progress and technology above all else. They get there hands on the latest in dwarven tech and renginer and modify it to their liking. Arc slave trade is more prevalent in Tauran lands than in other human nation by leagues. Taura is often called the wilds, but not because of its expanses of deserts and plains. But because, the nation is fairly lawless and justice is upheld through vigilantism. Never travel in Taura without a weapon. Most people in Taura live in massive hive cities that run rampant with crime and disease.",
							new Stat[] {
									new Stat("CRA",2),
									new Stat("CHR",1),
									new Stat("STR",1),
									new Stat("END",1)
							}),
					new AthObject("House Trident",
							"The people of Trident were forced to live on the edge of their lands by the cursed beastmen. They now travel solely by treetop out of fear of the beasts below. Because of their constant contact with the Cursed, they highly respect Kyan and her domain. In addition, the lands of Surch are the only human nation that is strictly matriarchal.",
							new Stat[] {
									new Stat("WIS",2),
									new Stat("SPD",2),
									new Stat("STR",1)
							}),
					new AthObject("House Talavaar",
							"The people of Talwar are most widely known for their vast markets and beast taming. They value the marks of a good deal and life long lived. They also hold all life in high esteem and only take a life when they absolutely have to. The wealth gap in Talwar, however is larger than any other nation, and slums stretch out as far as the eye can see.",
							new Stat[] {
									new Stat("CAS",3),
									new Stat("STR",2),
									new Stat("CRA",1),
									new Stat("END",-1)
							}),
					new AthObject("House Fong",
							"It is said the gods have blessed the land of Mofan, because people of this land have a strange understanding of the mystic arts. People with the gift are highly respected and are often put positions of government. It’s actually rare for mages to be put in combat positions, because they are considered too valuable a resource.  The Mofan value structure and putting society before the individual.",
							new Stat[] {
									new Stat("CAS",5),
									new Stat("INT",2),
									new Stat("STR",-2)
							})
				},
				new AthObject[] //elf
				{
					new AthObject("High",
							"You are naturally born with either electricity or ice magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " + 
							"If you are a class that incorporates magic then... " + 
							"If you choose Vydon or Ion  as your god your magic will be twice as strong. If not you can wield both elements.",
							new Stat("CAS",5)),
					new AthObject("Wood",
							"You are naturally born with either Earth or wind magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " + 
							"If you are a class that incorporates magic then... " + 
							"If you choose Kyna or Orion as your god your magic will be twice as strong. If not you can wield both elements.",
							new Stat[] {
								new Stat("DEX",6),
								new Stat("SPD",2),
								new Stat("CAS",-3)
							}),
					new AthObject("Dark",
							"You are naturally born with either Dark or poison magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " +
							"If you are a class that incorporates magic then..." + 
							"If you choose Edoria or Veleion as your god your magic will be twice as strong. If not you can wield both elements",
							new Stat[] {
									new Stat("STR",4),
									new Stat("CON",4),
									new Stat("SPD",1),
									new Stat("DEX",1),
									new Stat("CAS",-2),
									new Stat("INT",-2),
									new Stat("CRA",-1)
							}),
					new AthObject("Silion",
							"You are naturally born with either light or energy magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " +
							"If you are a class that incorporates magic then... " + 
							"If you choose Clara or Sila as your god your magic will be twice as strong. If not you can wield both elements. You can the ability to magically alter your size: You can shrink as small as 5.08 cm (2in) and grow as large as 137.16cm (4.5 ft)",
							new Stat[] {
									new Stat("INT",3),
									new Stat("CRA",2),
									new Stat("WIS",3),
									new Stat("STR",-4),
									new Stat("END",-2)
							}),
					new AthObject("Either",
							"You are naturally born with either water or metal magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " + 
							"If you are a class that incorporates magic then..." + 
							"If you choose Urana or Daytan as your god your magic will be twice as strong. If not you can wield both elements.",
							new Stat[] {
									new Stat("WIS",3),
									new Stat("CON",3),
									new Stat("STR",1),
									new Stat("DEX",1),
									new Stat("CAS",-3)
							}),
					new AthObject("Thatcher",
							"You are naturally born with either sand, or fire magic you can use  either of these elements even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) "+
							"If you are a class that incorporates magic then...\n" + 
							"If you choose Aria or Alarc as your god your magic will be twice as strong. If not you can wield both elements.",
							new Stat[] {
									new Stat("STR",6),
									new Stat("SPD",4),
									new Stat("INT",-2),
									new Stat("CAS",-2),
									new Stat("CHR",-1)
							}),
					new AthObject("Lumos",
							"Choose any two of the 14 elements you can use this element even if you are not a mage, priest, or wanderer. (it will be far less effective if you are not a class that incorporates magic) " +  
							"If you are one of the classes that incorporates magic then..." + 
							"When you choose a god you will gain the ability to use both those elements " +  
							"If you choose the same god and element associated with that god then it will stack and you will become more powerful with that element. ",
							new Stat[] {
									new Stat("STR",5),
									new Stat("END",3),
									new Stat("INT",7),
									new Stat("CHR",6),
									new Stat("DEX",4),
									new Stat("CAS",15),
									new Stat("WIS",2),
									new Stat("SPD",4),
									new Stat("CON",2),
									new Stat("CRA",3)	
							})
				},
				new AthObject[] //ark
				{
					null		
				},
				new AthObject[] //orc
				{
					new AthObject("Oku",
							"You come from the Northern side of Orcish lands. You are by far the rarest type of Orc and yet when people picture your species they think of you. You gain the ability to go into a Berserker rage. In this state you strength is increased by 50% and your health is doubled.",
							new Stat[] {
									new Stat("STR",2),
									new Stat("END",3),
									new Stat("CON",3),
									new Stat("CHR",-1),
									new Stat("INT",-2)
							}),
					new AthObject("Nokeru",
							"The Most common type of Orc found on the south eastern border. You have had more interaction with other races than any other type of Orc, and because of this you can fit in a little better with other cultures.",
							new Stat[] {
									new Stat("DEX",2),
									new Stat("SPD",3),
									new Stat("CHR",1),
									new Stat("STR",-1)
							}),
					new AthObject("Geken",
							"Found in the far eastern shores of Orcish lands. These orcs stand at about 137.16 cm (4.5ft) tall and are by far the smallest of their kind. They make up for their lack of strength with their devotion to studying.",
							new Stat[] {
									new Stat("DEX",3),
									new Stat("SPD",1),
									new Stat("INT",2),
									new Stat("CRA",1),
									new Stat("STR",-3),
									new Stat("CON",-2),
									new Stat("Balance",1)
							})
				},
				new AthObject[] //zeverin
				{
					null								
				},
			});
			
			// inti Classes
			classes = new Classes(new AthObject[] 
			{
					new AthObject("Warrior",									
							"A front line fighter, Warriors, focus on melee combat relying on their own strength as opposed to unreliable technology or limited magic. The warrior class is great for distracting multiple enemies and taking the brunt of the enemy force, while also being able to deal massive damage in return. However, warriors tend be ill equipped for situations that require more planning than a full frontal assault. They are also vulnerable to ranged attacks they can't close on. Finally, without another character’s support, the warrior is often vulnerable to surprise attacks.",
							new Stat[] {
									new Stat("STR",1),
									new Stat("CON",1),
									new Stat("END",1),
									new Stat("CAS",-1),
									new Stat("WIS",-1)
							}),
					new AthObject("Ranger",
							"Rangers focus on utility based combat, using firearms and tools to get the jobs done. They trust in the strength of their knowledge and pride themselves in  accuracy and their exceptional preparation. The ranger’s strength resides in their careful planning and taking out opponents one at a time. The ranger's does not handle the unexpected very well, and needs a good front line support, incase they run out of ammunition before all the enemies are dead.",
							new Stat[] {
									new Stat("DEX",1),
									new Stat("SPD",1),
									new Stat("INT",1),
									new Stat("STR",-1),
									new Stat("WIS",-1)
							}),
					new AthObject("Mage",
							"In most cases people choose a god to follow, but for a select few a god will choose a person and grant them the gift of magic. These people can manipulate the element of the god that chose them. In most cases these individuals are found and trained to be a Mage. Mages are warriors who can create and control their perspective elements as well as use wands and staffs. Mages deal massive damage to their opponents, but have very little in the way of defense.",
							new Stat[] {
									new Stat("CAS",1),
									new Stat("INT",1),
									new Stat("DEX",1),
									new Stat("CON",-1),
									new Stat("WIS",-1)
							}),
					new AthObject("Priest",
							"Priests are individuals who were not chosen to use magic, but instead devoted their life to a god and are able to cast spells from the god they follow. Their ability to cast these spells is dependent on their devotion and how well they follow the tenets of their god. Unlike mages, priests must say a prayer in order to cast a miracle. While the priest’s miracles are typically less powerful than a mage’s magic, they are far more versatile.",
							new Stat[] {
									new Stat("WIS",1),
									new Stat("CAS",1),
									new Stat("STR",1),
									new Stat("DEX",-1),
									new Stat("SPD",-1)
							}),
					new AthObject("Wanderer",
							"A Wanderer is an individual who was gifted the ability of magic, but had no formal training in it. As such they can use wand, staffs, and can manipulate their element if it's around them, but cannot create their element. Instead they use technology for their ranged abilities, and eventually are able to enchant their tech with magical support. Wanderers make fantastic support troops, but cannot deal as much damage as some of the other classes.",
							new Stat[] {
									new Stat("SPD",1),
									new Stat("CAS",1),
									new Stat("DEX",1),
									new Stat("STR",-1),
									new Stat("CON",-1)
							}),
					new AthObject("Soldier",
							"Soldiers combine their combat prowess with their knowledge of various armors or equipment to create one of two types of fighters a tank trooper and a shock trooper. The soldier is often found on the front lines of combat along with warriors, but can also deal with enemies at a range. While the tank trooper is great at tanking damage their ability to deal damage is not as effective. On the other hand the shock trooper will deal large quantities of damage in short bursts, but have to retreat between each attack or face death. The soldier is most often found on the battlefield making the brunt of the infantry.",
							new Stat[] {
									new Stat("STR",1),
									new Stat("DEX",1),
									new Stat("CON",1),
									new Stat("INT",-1),
									new Stat("CAS",-1)
							})
			},
			new AbilityScores[] 
			{
					new AbilityScores(3,1,1),
					new AbilityScores(1,3,1),
					new AbilityScores(1,1,3),
					new AbilityScores(2,1,2),
					new AbilityScores(1,2,2),
					new AbilityScores(2,2,1)
			});
			
			// inti Origins
			origins = new Origins(new AthObject[]
			{
				new AthObject("Ark Origin",
						"Just after your construction you were sold to humans from Talavinian lands to a fight in a Ark Arena. Your whole life has been doing what humans have told you. Your masters were not particularly cruel, aside from the fact that they made you fight three battles a day. After 3 years of fighting in the arena your handler grew very fond of you and payed for your release. Where will you go with your freedom?",
						new Stat("Trait","Robo Boxer".hashCode())),
				new AthObject("Zeverin Origin",
						"You were born in a pod amongst hundreds. You like all your brothers and sisters will never know your true parents, because the Zeverin are raised by the elders. Once you grew large enough to join a tribe you did. Until you and challenged the chief for his status. You being far too young to defeat her in combat, lost and were kicked from the tribe. Now you have your sites set on the surface world. A place very few Zeverin travel."),
				new AthObject("Palace",
						"You were born in luxury and lived your life in luxury. Hardship was never something you knew growing up. You had servants you loved you and parents who let you do anything as long as you did not tarnish the family name. Some people say your weak for not living on the streets, but what do they know. You not only have the best education money can buy, but also you’ve been trained by the finest fighters in the realm.That was until your father told you at the age of fifteen it was time for you to make a name for yourself and add to the family mythos.  Your fourth in line for the estate so maybe it is time to make your one place in this world.",
						new Stat("gil",2000)),
				new AthObject("Slum",
						"Hardship is all you’ve known your entire life, from a very early age you learned it was a dog eat dog world. You witnessed your first murder at age six and got into your first real fight to the death at age 12. Your mother was a prostitute and an addict  and your father an abusive drunk you never met. There was a time you dreamed that your parents were actually royalty and that one day your King and Queen parents would come and pick you off the streets. That was then, now you know the truth; the real trash of this world aren’t its criminals, they just do what they need to, survive. No, the real trash are those rich monsters in their golden towers watching as the rest of the world suffer. At age 15 you meet a very interesting individual. A middle aged man who was looking for someone to carry around his weapons. After that your life changed forever.",
						new Stat[] {
								new Stat("SPD",2),
								new Stat("STR",2)
						}),
				new AthObject("Fort",
						"You never knew your parents, perhaps they died when you were very young, or maybe they gave you up. You suppose it doesn't matter you were sent to the same place that all orphans go in Atheria, the local fort. This world has a need for people without attachments to feed the ranks in war, and the wars create a steady supply of orphans. All your life you have known hard work and rules. There's no need to hate those above you after all they are the ones who are feeding you, and yet you’ve always wondered what is life beyond these walls and rules. One day you witness some of your fellow trainees trying to escape. Do you go with them, or will you continue this path and eventually be sent to a battlefield you may never return from?",
						new Stat[] {
								new Stat("STR",2),
								new Stat("CON",2)
						}),
				new AthObject("Ship",
						"You grew up in the city, just another person in the crowd. You had a loving mother and father, but you wanted more, you wanted adventure. At the age of thirteen you left home and joined a crew of a mercenary vessel. You were nothing more that a deckhand, but at least you had the chance to see the world. Slowly but surely you built up skills and and moved up in ranks. Now at fifteen you are given a choice remain on the ship as a full fledged mercenary, or upon docking leave for a new adventure.",
						new Stat("Choice",123)),
				new AthObject("Temple (Mage)",
						"At a very young age it was discovered you were gifted by the gods, as such your parents shiped you off to the nearest temple were you would learn to control and hone your magical abilities. At age fifteen you go to test into the mage knight program, if you succeed you will become an arbiter of peace and justice for the globe. If you fail however, there are plenty of jobs for a person of your talents.",
						new Stat("CAS",3)),
				new AthObject("Temple (Priest)",
						"Your parents were devout followers of their god as such they sent you to the local temple where you would grow closer and closer to your god. Eventually you found that your faith was so strong that you were able to cast small miracles. Now at age fifteen you want to head out and do works for your god. That way you can wield the same abilities as they do.",
						new Stat("WIS",3)),
				new AthObject("Village",
						"All you knew was the simple life and you were fairly happy with it. Your parents were farmers and that's what you were going to do. Once you were old enough you would marry your sweetheart and continue life as you’ve always known it. At least that was the plan until the raiders attacked. At the age of fifteen you witnessed the death of your whole family, the person you loved, and everyone you had ever met. The only reason why you survived was because you were saved by a traveler who was lost from the rest of her group. She decided to take pity on you and take you under her wing.",
						new Stat("Trait","Tracker".hashCode()))// Class Score Limits
			});
			
			// init Jobs
			jobs = new Jobs(new AthObject[]
			{
				new AthObject("Knight",
						"You finally made it, after years of work under a knight you finally get to be one. At the age of twenty you finely honed your skills enough to the point that you can lead men into battle and not be led. In reality the infantry led do the dying and Knights get the glory. There is no better life than that. You can choose to follow a strict code of honor, but honestly you'd be one of the rare cases. Most knights wait in the back for the battle to finish and tell tales of their glorious victories. However, if you want to be in the thick of it with your men then you a bigger hero than most; and hey, maybe you can save some lives in the proses. After a couple months you find out that you haven't been keeping up with the political side of things; which can be a far more dangerous game than War. It's time for you to get out of this division or risk been poisoned at one of the banquets.",
						new Stat("gil",2000)),
				new AthObject("Infantry",
						"You've been in the thick of battle for five years. You've seen the world and it's nowhere near as glamorous as the stories made it out to be. You seen your brothers and sisters die so much it doesn't even phase you anymore. In fact you don't even bother remembering the new recruits names until they've survived for at least two weeks. “War is about old men talking and young men dying” this is a saying you know all too well. Honestly you're only alive because you're smart, and you realize that heros and idiots die early. Your superiors are cowards who spend all their time in the rear while you do the real leading. Yet in the end you still won't get anything but more blood on your hands. Sometimes you wonder yourself what's worse the fighting or the waiting. After this tour though your done; your free.",
						new Stat[] {
								new Stat("CON",2),
								new Stat("STR",1),
								new Stat("gil",1200)
						}),
				new AthObject("Pirate",
						"Life is dirty, but life it good. You spend your days on a ship either at sea or air raiding merchant vessels. The best part is that for the most part they surrender before you even have to fire a shot. On the days your not raiding you spend your free time blowing your money on sex and booze. You've been on this ship for five years now and have risen to the rank of first mate. You think it may be because the captain had a crush on you. Sadly the crew hasn't been as loyal as you were and have mutinied. They killed the captain and are making you walk the plank. Luckily you survive and swim to shore the rest of the loyal crew not so lucky.",
						new Stat[] {
								new Stat("gil",800),
								new Stat("Bal",1)
						}),
				new AthObject("Mage Knight",
						"When you passed the entrance exam you thought your training was over. Sadly you were mistaken and had another five years or rigorous training before they made you into a Mage Knight. Now that you are one you've been sent out on the most basic of missions patrol the world and keep the peace. You suspect they do this to kill off those not talented enough to make a name for themselves. However, those that do make a name for themselves are granted quest based on how highly they are renowned. You dream of being one of the 13 Masters, but that is decades away.",
						new Stat[] {
								new Stat("Item","wand".hashCode()),
								new Stat("gil",600)
						}),
				new AthObject("Mercenary",
						"You decided to use your skills for personal gain and there is absolutely nothing wrong with that. In fact joining a mercenary company is one of the most respected and common jobs a talented fighter can enjoy. You did really well as a member of the BlackGuard (blackguard specialises in protecting high value targets). However, all good things eventually come to and end. You got blamed for a job going south and was kicked out of the company.",
						new Stat[] {
								new Stat("CRA",1),
								new Stat("STR",1),
								new Stat("gil",1800)
						}),
				new AthObject("Hunter",
						"You have been a hunter for five years and here there are two kinds of hunters in this world those who hunt beasts that terrorize villages, and those who hunt people. Both types of hunter pay extremely well. Regardless of what kind of hunter you were there is a dead noble in the town your in and everyone is convinced you are the one who killed him. Luckily they don't know your name so you were able to leave town before you were lynched.",
						new Stat[] {
								new Stat("CON",1),
								new Stat("SPD",1),
								new Stat("gil",1500)
						}),
				new AthObject("Thief",
						"You have been part of the criminal world for five years now and you have stolen a lot of items from a lot of different people. However, when you here hired by a paranoided crime boss you knew something was off. Right before you were going to turn in the artifact you found out from one of your birds that he wasn’t a fan of loose ends. So you sold the artifact and used the money to make an escape.",
						new Stat[] {
								new Stat("CHR",1),
								new Stat("SPD",1),
								new Stat("gil",1500)
						})				
			});
			
			// init NPCS
			npcs = new NPCs(new AthObject[][] {
				// Gods
				new AthObject[]{
					new AthObject("Hytherion",
							"Hytherion, exists both inside and outside of time, able to travel and through different parts in history while also existing in the present (Don't think too hard on it, not even he understands what he's doing half the time). Even though he knows which outcome will happen he always has hope, and as much as he wished he could say he never intervened with the timeline to ensure victory for heroes, he can't. It is extremely rare for Hytherion to gift someone magic, and even rarer for him to father children, this is because he fears his abilities may be too powerful for a mortal to contain. So he waits for very special individuals called “Wells” who can hold enough mana. Even though Hytherion is currently the most powerful of the gods he refuses to flaunt his power, instead he spends most of his time as a passive observer. However, when it does come time to act  Hytherion won't hesitate to call upon Hourglass and Time piece and do what must be done.",
							new Stat[] {
									new Stat("WIS",1),
									new Stat("CAS",1),
									new Stat("SPD",2)
							}),
					new AthObject("Urana",
							"Urana loves adventure and is never found in any one place for too long. As soon as she sets her mind on a task she will complete it no matter how long it takes. She once kept her eyes shut of 10 years, because Sleith bet she couldn't (Sleith never actually checked to see if she actually had her eyes closed, because if he was being honest he stopped caring after 5 minutes). There is nothing Urana finds more admirable than when a mortal sails towards the storm even at the risk of their own life, both figuratively and literally. If you manage to invite her wrath the storm that follows could drown the world ( again figuratively and literally). Urana calls upon her Trident quite often, in fact, it is said everytime there is a storm at sea that's her practicing. She is practicing because she plans on challenging Vyden for the second spot, next will be Hytherion.",
							new Stat("CON",4)),
					new AthObject("Ion",
							"Ion is usually spends his time helping the lives of mortals. You can find Ion playing with orphans in the streets of High Castle, in the political halls of Cabadras, or even on the battlefield fighting alongside people defending their village. Ion will do anything to maintain law, peace, and justice. Even so, he hasn't called upon his Claymore Gareth in 2000 years for he fears it's destructive capabilities will cause more harm than good, as it did last time. Secretly Ion wishes he was mortal. That he could live his life doing the small things that make people happy, instead of doing fantastical deeds that earn him praise.",
							new Stat[] {
									new Stat("CHR",1),
									new Stat("CON",3)
							}),
					new AthObject("Kyna",
							"Kyna loves nature, but she thoroughly detests those without the wisdom to respect it. To those individuals she curses them with a bestial disease that she had Veleion craft. At first the curse seems like a blessing grating supernatural abilities, but upon death the individual is transformed into a mindless half bread also known as a beastmen. Their soul is trapped in their body as they are forced to watch themselves prey on others and be hunted and hated like an animal. Kyna has a cool personality and rarely gets emotional but if she must she will call upon her warhammer Atheria, with one swing of her hammer she can create canyons and raise mountains.",
							new Stat[] {
									new Stat("WIS",3),
									new Stat("CON",1)
							}),
					new AthObject("Clara",
							"Clara loves mortals more than anything and won't hesitate to take up arms for them, even use Her rapier Starmaker that can pull the light from a Star and create a beam of light that could pass through a mountain range. Although she would never use it in the presence of mortals, for she can't stand it to see them get hurt. She spends most of her time setting up charities and running her various hospitals throughout the lands. She hates it when mortals kill each and believes there is always another option even in war.",
							new Stat[] {
									new Stat("CAS",3),
									new Stat("WIS",1)
							}),
					new AthObject("Daytan",
							"All Daytan wants is to be left alone, why do all these mortals always ask for his help, and why can't they achieve their goals themselves? Being one of the most commonly worshipped Gods in the land he is always pestered with requests asking for the strength to get through the work day. They should be honored to be doing something for their community. However, when Daytan does see a hardworking individual who does value his work he blesses them immensely. If someone was stupid enough to enter his place of work and disrupt his work environment. They will get a real beating. The only time Daytan ever leaves his workshop is when the entire world is endangered. Only then will he exists his work environment with his hands wrapped by Derious, at that time he will conduct a very different kind of work.",
							new Stat[] {
									new Stat("CRA",4),
									new Stat("STR",1)
							}),
					new AthObject("Sila",
							"There is nothing Sila holds in higher regard than the purity of family. Whenever mortals go to war it is Sila they pray to for their safe return. She hopes that one day peace will become the world’s default state, but until then she will continue to guide as many mortals home as she can. Her crossbow Willow’s bolts will seek impure hearts. Sila has never been in a relationship, because she is waiting for the one that she is head over heels with. She is starting to believe that person won't ever exist, and she keeps asking her brother Hythieron but he simply refuses to tell her.",
							new Stat[] {
									new Stat("CON",2),
									new Stat("WIS",2)
							}),
					new AthObject("Vyden",
							"Vyden has all the knowledge in the world, so much knowledge in fact, he can practically predict the future (or at least the most likely outcome). The only reason why Vyden isn't considered the most powerful of the gods and goddesses is because while Vyden’s predictions are at an accuracy rate of 99.99987% Hytherion will always be 100%. This minuscule detail doesn't bother Vyden, for what are the minds of his Brothers and Sisters compared to him. On top of that if he were to fight Hytherion with all his might he is certain that he and Righteous Insight would annihilate his younger Brother.",
							new Stat[] {
									new Stat("INT",2),
									new Stat("Bal",1)
							}),
					new AthObject("Sleith",
							"At one point Sleith was so powerful he defeated all his Brothers and Sisters at once, just because he was bored. He wasn't alone of course, with him were his army of two hundred Vampires a species he created. Eventually he released his siblings from their prison and turned himself in to Father, once again, because he was board. As punishment for his action father sealed his mouth and eyes so he couldn't create anymore Vampires. The only one who can release sleith from this fate is Hytherion, however he seems content leaving him like this at least for the next few thousand years. He can roam around in the fake body he created, but if he needs to use any magic he must revert to his true form. A form that is truly terrible to behold.",
							new Stat[] {
									new Stat("DEX",1),
									new Stat("STR",1),
									new Stat("CHR",2)
							}),
					new AthObject("Orion",
							"Orion is obsessed with favors. He is willing to give almost anything to anyone so long as they sign a soul binding contract saying they owe him a favor in return. The greater the wish granted the bigger the favor will be. If you do agree to a contact your name is sealed as a tattoo on his arm. Being the fastest being in existence Orion will find you and kill you swiftly if you break contract or refuse to follow through. While he would prefer to exact justice face to face, if he has to he will use his bow Tasker. A devastating weapon that can demolish a city from 5,000 miles away. When he's not hunting those who go back on a deal he is quite friendly and quick witted, just don't get on his bad side.",
							new Stat[] {
									new Stat("CHR",3),
									new Stat("SPD",2)
							}),
					new AthObject("Veleion",
							"Veleion is not one for open combat, in fact he is probably the least talented in face to face combat of all his siblings. He prefers to keep to himself working on his science projects. Which for the most part include torturing his subjects with various diseases in his search for the next method of keeping the populations in check. When he does fight he will prey on unsuspecting victims allowing him to take down anyone or anything without them realizing what happen. If you do end up in one of Veleion’s traps pray it kills you, because if it doesn't you will suffer for weeks, if you are extremely lucky, in his laboratory.",
							new Stat[] {
									new Stat("CRA",4),
									new Stat("INT",1)
							}),
					new AthObject("Edoria",
							"Edoria just wants to be seen and doesn't understand why she isn't the most beloved goddess in all the land. She often wonders why people hate the darkness and love the light, when the darkness is so much more calming; light is just blinding. Edoria wonders why the mortals don’t realize that she loves them more than Clara, that she is more beautiful than Aria, that she is their home and they don’t need anyone else but her. Sometimes Edoria fantasies about killing the other gods and goddesses that way she will be the only one the mortals love, but sadly Mother and Father won’t allow it.",
							new Stat[] {
									new Stat("DEX",2),
									new Stat("SPD",2)
							}),
					new AthObject("Alarc",
							"Alarc is easily the strongest of his siblings, and could easily beat anyone of his brothers or sisters in a fair fight. However, in his eyes he is the only one who would fight fair. There is nothing Alarc loves more than a good fight and will accept any challenge that comes is way. However, If he saw someone cheat or use any underhanded method he would go into a fit of rage and kill anything associated with the vial act. If he deems an opponent worthy he will take out his axe Unstoppable and shield Unbreakable which were named for good reason.",
							new Stat[] {
									new Stat("STR",2),
									new Stat("CON",2)
							}),
					new AthObject("Aria",
							"Aria just wants to be happy and have fun, and she wants the same thing for all her followers. She does what she wants, who she wants, when she wants, and she wants the same for all those around her. Devotion is for lesser beings but desire is what keeps the peace, for as long at the people are happy Aria’s happy. However, when someone tries to get in the way of Aria’s fun she will gladly blow off some steam by cracking their skull. Aria has never found an opportunity to call her quarterstaff Niera in to battle, the world should be scared for the day when that's what she wants to do.",
							new Stat[] {
									new Stat("CHR",2),
									new Stat("ANY",2)
							}),
					new AthObject("The Void (Godless)",
							"For one reason or another you have decided to reject following any god. While this is frowned upon in most areas of Athiera, you will never legally be charged for being a godless. The law however, won't try very hard to prevent finatics from lynching you. On the flip side you now have access to certain unknown underground resources.",
									new Stat("ANY",2))
				}
				// NPCs
				,new AthObject[]{
					new AthObject("Captain Carter 'Glass' Aqueous",
							"Captain Glass has a habit of always asking questions. “Where are you from, where is my gold, are you willing to lose both eyes, and ear, and your testicles for it?” While it is rare for a pirate to be educated, no Eran would ever think of mocking Captain Glass for his “royal” upbringing. In fact the nation has prospered under his rule, but that might be because his punishments for betrayal and failure are quite severe. When he’s not in a murdering sort of mood he’s quite funny and just a tad bit of a softy. "),
					new AthObject("Lady Miriam Fumous",
							"Lady Miriam is a far cry from her older brothers. She values diplomacy over rash action, which may be the reason her Father, Marcus the Wise, choose her to take the place as head of the house when he passed. She is elegant and kind, but also fierce and respected. Her current goal is to change Furras cultural mind set in to one that will reclaim the throne without the need for war, not that she isn’t willing to take the road if she has to."),
					new AthObject("Jarl Ulrich Snowden",
							"Jarl Ulrich has seen more battles than hairs on his body and he’s always looking for more. He is utterly obsessed with victory through combat and will solve most issues with a personal brawl. He is as cold and harsh as his land and believes firmly in life for life. To him mercy is a concept for the weak and foreign, which he is not overly fond of. His arrogance is unparalleled, and he’s not looking to lead his nation into prosperity only glorious battle."),
					new AthObject("High King Eric Heart",
							"The Head of all humanity. A strong yet arrogant leader. While he cares for his people as a whole the individual suffering of a person means next to nothing for him. While he would never admit to this publicly he strives to make humanity the seat of power for all Adar. Unlike his crooked family he prefers a direct approach which is a very dangerous way of thinking in Dirun."),
					new AthObject("Lord Aali Sagir",
							"Lord Sagir is a kind and generous man who puts the needs of his people above all else. In fact he believes that those in power are meant to support the people, not the other way around. He abhors violence and because of that is not very skilled at it. He wishes to see those in his lands prosper and cares little for the game of politics."),
					new AthObject("Dr Richard Taurus",
							"By all accounts Dr Taurus is a genius, his intellect far supasses most of the elven elders. He is also a sociopath. While not violent (usually) he is incapable of feeling any empathy.  He only cares for his people as part of his public image and even that he has little patience for. Oddly enough there are rumors going around saying he is building something very large and incredibly dangerous."),
					new AthObject("Lady Elaine Trident",
							"Lady Elaine was adopted by the Trident house after both her parents were cursed by Kyna. As such she has no royal blood, and has little respect from her people. She is quick in trying to prove herself, and often thinks only after she acts. Luckily for her she is highly skilled at fighting monsters and traveling through the trees. She hopes to be seen and remembered as a true trident by reclaiming the inland."),
					new AthObject("Lady Aanya Talavaa",
							"Lady Talavaar lived her life in elegance and grandeur, but she always wished she didn’t. She wished she was free to go out and adventure without that chain of her family name. She often looks to the horizon in search of an escape only to be disappointed by her duties. There are rumors going around that the syndicate Red Eye was hired to see  her dead, so perhaps she will get the adventure she always dreamed of."),
					new AthObject("Lady Ying Yue Fong",
							"Originally the house was to be taken over by Lady Fong’s younger brother. However, after his unfortunate death in the battle of Cathous Lady Fong was named ruler. Lady Fong has long surpassed any expectations as an leader. She is quick witted and incredibly strong willed. On top of that her incredible intellect is only topped by her skill in battle."),
				}
				
			},
			// Gifts of God
			new AthObject[] {
				new AthObject("Time",
						"Force"),
				new AthObject("Willpower",
						"Water"),
				new AthObject("Order",
						"Ice"),
				new AthObject("Wisdom",
						"Earth"),
				new AthObject("Love",
						"Light"),
				new AthObject("Work",
						"Metal"),
				new AthObject("Life",
						"Energy"),
				new AthObject("Knowledge",
						"Electricity"),
				new AthObject("Death",
						"Blood"),
				new AthObject("Trade",
						"Wind"),
				new AthObject("Disease/Famine",
						"Poison"),
				new AthObject("Chaos",
						"Darkness"),
				new AthObject("War",
						"Fire"),
				new AthObject("Desire",
						"Sand"),
				new AthObject("Null",
						"Void")
			});
			
		}
	}

}