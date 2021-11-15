package me.grggamer.persistentdatalib.Item;

import me.grggamer.persistentdatalib.PersistentDataLib;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;

public abstract class ItemPersistentData {

    private static final Plugin plugin = PersistentDataLib.getPlugin(PersistentDataLib.class);


    //Setting (Adding) values

    //Integer
    public static void addIntData(ItemStack itemStack, String key, Integer data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.INTEGER, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //IntegerArray
    public static void addIntArrayData(ItemStack itemStack, String key, int[] data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.INTEGER_ARRAY, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //String
    public static void addStringData(ItemStack itemStack, String key, String data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.STRING, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //double
    public static void addDoubleData(ItemStack itemStack, String key, double data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.DOUBLE, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //byte
    public static void addByteData(ItemStack itemStack, String key, byte data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.BYTE, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //byteArray
    public static void addByteArrayData(ItemStack itemStack, String key, byte[] data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.BYTE_ARRAY, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //float
    public static void addFloatData(ItemStack itemStack, String key, float data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.FLOAT, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //long
    public static void addLongData(ItemStack itemStack, String key, long data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.LONG, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //longArray
    public static void addLongArrayData(ItemStack itemStack, String key, long[] data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.LONG_ARRAY, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //PersistentDataContainer (TagContainer)
    public static void addTagContainerData(ItemStack itemStack, String key, PersistentDataContainer data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.TAG_CONTAINER, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static void addTagContainerArrayData(ItemStack itemStack, String key, PersistentDataContainer[] data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY, data);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }

    //Location
    public static void addLocationData(ItemStack itemStack, String key, Location data){
        try {
            ItemMeta meta = itemStack.getItemMeta();
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            String locdata = data.getWorld().getName() + ";" + data.getX() + ";" + data.getY() + ";" + data.getZ() + ";" + data.getPitch() + ";" + data.getYaw();
            container.set(namespacedKey, PersistentDataType.STRING, locdata);
            itemStack.setItemMeta(meta);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
    }



    //Getting values

    //Integer
    public static Integer getIntDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.INTEGER);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //IntegerArray
    public static int[] getIntArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.INTEGER_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //String
    public static String getStringDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.STRING);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Double
    public static Double getDoubleDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.DOUBLE);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Byte
    public static Byte getByteDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.BYTE);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //ByteArray
    public static byte[] getByteArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.BYTE_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Float
    public static Float getFloatDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.FLOAT);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Long
    public static Long getLongDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.LONG);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //LongArray
    public static long[] getLongArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.LONG_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //PersistentDataContainer (TagContainer)
    public static PersistentDataContainer getTagContainerDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.TAG_CONTAINER);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static PersistentDataContainer[] getTagContainerArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
        }
        try {
            return container.get(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY);
        } catch (NullPointerException e) {
            plugin.getLogger().info(ChatColor.RED + "ERROR: No data was found with key: " + key + ".");
        }
        return null;
    }

    //Location
    public static Location getLocationDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = null;
        NamespacedKey namespacedKey = null;
        try{
            ItemMeta meta = itemStack.getItemMeta();
            container = meta.getPersistentDataContainer();
            namespacedKey = new NamespacedKey(plugin, key);
        } catch (NullPointerException e){
            plugin.getLogger().info(ChatColor.RED + "ERROR: ItemStack has no meta or empty.");
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
    public static boolean hasIntegerDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.INTEGER);
    }

    //IntegerArray
    public static boolean hasIntegerArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.INTEGER_ARRAY);
    }

    //String
    public static boolean hasStringDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.STRING);
    }

    //Double
    public static boolean hasDoubleDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.DOUBLE);
    }

    //Byte
    public static boolean hasByteDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.BYTE);
    }

    //ByteArray
    public static boolean hasByteArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.BYTE_ARRAY);
    }

    //Float
    public static boolean hasFloatDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.FLOAT);
    }

    //Long
    public static boolean hasLongDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.LONG);
    }

    //LongArray
    public static boolean hasLongArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.LONG_ARRAY);
    }

    //PersistentDataContainer (TagContainer)
    public static boolean hasTagContainerDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.TAG_CONTAINER);
    }

    //PersistentDataContainerArray (TagContainerArray)
    public static boolean hasTagContainerArrayDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.TAG_CONTAINER_ARRAY);
    }

    //Location - key
    public static boolean hasLocationDataByKey(ItemStack itemStack, String key){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        return container.has(namespacedKey, PersistentDataType.STRING);
    }

    //Location - key and value
    public static boolean hasLocationDataByKeyAndValue(ItemStack itemStack, String key, Location location){
        PersistentDataContainer container = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
        if (container.has(namespacedKey, PersistentDataType.STRING)){
            String[] data = container.get(namespacedKey, PersistentDataType.STRING).split(";");
            return location.equals(new Location(Bukkit.getServer().getWorld(data[0]), parseDouble(data[1]), parseDouble(data[2]), parseDouble(data[3]), parseFloat(data[4]), parseFloat(data[5])));
        }
        return false;
    }

}
