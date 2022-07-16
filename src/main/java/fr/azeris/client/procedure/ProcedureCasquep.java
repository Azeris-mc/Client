package fr.azeris.client.procedure;

@ElementsAzerisMod.ModElement.Tag
public class ProcedureCasquep extends ElementsAzerisMod.ModElement {

	public ProcedureCasquep(ElementsAzerisMod instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Casquep!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 1, (int) 2, (false), (false)));

	}

}
