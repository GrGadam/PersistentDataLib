package io.github.grgadam.persistentdatalib.Entity;

import io.github.grgadam.persistentdatalib.PersistentDataLib;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;

public abstract class EntityPersistentData {

    private static final Plugin plugin = PersistentDataLib.getPlugin(PersistentDataLib.class);


    //Setting (Adding) values

    //Integer
    public static void addIntData(Entity entity, String key, Integer data){
            PersistentDataContainer container = entity.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.INTEGER, data);
    }

    //IntegerArray
    public static void addIntArrayData(Entity entity, String key, int[] data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.INTEGER_ARRAY, data);
    }

    //String
    public static void addStringData(Entity entity, String key, String data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.STRING, data);
    }

    //double
    public static void addDoubleData(Entity entity, String key, double data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.DOUBLE, data);
    }

    //byte
    public static void addByteData(Entity entity, String key, byte data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.BYTE, data);
    }

    //byteArray
    public static void addByteArrayData(Entity entity, String key, byte[] data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.BYTE_ARRAY, data);
    }

    //float
    public static void addFloatData(Entity entity, String key, float data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.FLOAT, data);
    }

    //long
    public static void addLongData(Entity entity, String key, long data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.LONG, data);
    }

    //longArray
    public static void addLongArrayData(Entity entity, String key, long[] data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.LONG_ARRAY, data);
    }

    //PersistentDataContainer (TagContainer)
    public static void addLongData(Entity entity, String key, PersistentDataContainer data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.TAG_CONTAINER, data);
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static void addLongData(Entity entity, String key, PersistentDataContainer[] data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        container.set(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY, data);
    }

    //Location
    public static void addLocationData(Entity entity, String key, Location data){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        String locdata = data.getWorld().getName() + ";" + data.getX() + ";" + data.getY() + ";" + data.getZ() + ";" + data.getPitch() + ";" + data.getYaw();
        container.set(namespacedKey, PersistentDataType.STRING, locdata);
    }




    //Getting values

    //Integer
    public static Integer getIntDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.INTEGER);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //IntegerArray
    public static int[] getIntArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.INTEGER_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //String
    public static String getStringDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.STRING);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Double
    public static Double getDoubleDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.DOUBLE);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Byte
    public static Byte getByteDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.BYTE);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //ByteArray
    public static byte[] getByteArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.BYTE_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Float
    public static Float getFloatDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.FLOAT);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Long
    public static Long getLongDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.LONG);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //LongArray
    public static long[] getLongArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.LONG_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //PersistentDataContainer (TagContainer)
    public static PersistentDataContainer getTagContainerDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.TAG_CONTAINER);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static PersistentDataContainer[] getTagContainerArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Location
    public static Location getLocationDataByKey(Entity entity, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            container = entity.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: Can't access entity data.");
        }
        try {
            String[] data = container.get(namespacedKey, PersistentDataType.STRING).split(";");
            return new Location(Bukkit.getServer().getWorld(data[0]), parseDouble(data[1]), parseDouble(data[2]), parseDouble(data[3]), parseFloat(data[4]), parseFloat(data[5]));
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }


    //Checking if value exists

    //Integer
    public static boolean hasIntegerDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.INTEGER);
    }

    //IntegerArray
    public static boolean hasIntegerArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.INTEGER_ARRAY);
    }

    //String
    public static boolean hasStringDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.STRING);
    }

    //Double
    public static boolean hasDoubleDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.DOUBLE);
    }

    //Byte
    public static boolean hasByteDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.BYTE);
    }

    //ByteArray
    public static boolean hasByteArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.BYTE_ARRAY);
    }

    //Float
    public static boolean hasFloatDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.FLOAT);
    }

    //Long
    public static boolean hasLongDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.LONG);
    }

    //LongArray
    public static boolean hasLongArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.LONG_ARRAY);
    }

    //PersistentDataContainer (TagContainer)
    public static boolean hasTagContainerDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.TAG_CONTAINER);
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static boolean hasTagContainerArrayDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY);
    }

    //Location - key
    public static boolean hasLocationDataByKey(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.STRING);
    }

    //Location - key and value
    public static boolean hasLocationDataByKeyAndValue(Entity entity, String key){
        PersistentDataContainer container = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);



        return container.has(namespacedKey, PersistentDataType.STRING);
    }

}
