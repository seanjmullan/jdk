import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.security.Provider;
import java.util.Collection;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * @test
 * @bug 9999999
 * @summary Test provider immutability
 */

public class UnmodifiableProvider {

    public static void main(String[] args) throws Exception {
        // TBD
    }

    static class UnmodProvider extends Provider {

        private final Provider p;

        UnmodProvider(Provider p) {
            super("Unmodifiable Provider", "0.0", "Unmodifiable Provider");
            this.p = p;
        }

        public Object clone() { return p.clone(); }
        public boolean contains(Object value) { return p.contains(value); }
        public boolean containsKey(Object key) { return p.containsKey(key); }
        public boolean containsValue(Object value) {
            return p.containsValue(value);
        }
        public Enumeration<Object> elements() { return p.elements(); }
        public Set<Map.Entry<Object,Object>> entrySet() { return p.entrySet(); }
        public boolean equals(Object o) { return p.equals(o); }
        public void forEach(BiConsumer<? super Object,? super Object> action) {
            p.forEach(action);
        }
        public Object get(Object key) { return p.get(key); }
        public String getInfo() { return p.getInfo(); }
        public String getName() { return p.getName(); }
        public Object getOrDefault(Object key, Object defaultValue) {
            return p.getOrDefault(key, defaultValue);
        }
        public String getProperty(String key) { return p.getProperty(key); }
        public String getProperty(String key, String defaultValue) {
            return p.getProperty(key, defaultValue);
        }
        public Provider.Service getService(String type, String algorithm) {
            return p.getService(type, algorithm);
        }
        public Set<Provider.Service> getServices() { return p.getServices(); }
        public double getVersion() { return p.getVersion(); }
        public String getVersionStr() { return p.getVersionStr(); }
        public int hashCode() { return p.hashCode(); }
        public boolean isConfigured() { return p.isConfigured(); }
        public boolean isEmpty() { return p.isEmpty(); }
        public Enumeration<Object> keys() { return p.keys(); }
        public Set<Object> keySet() { return p.keySet(); }
        public void list(PrintStream out) { p.list(out); }
        public void list(PrintWriter out) { p.list(out); }
        public Enumeration<?> propertyNames() { return p.propertyNames(); }
//        protected void rehash() { p.rehash(); }
        public void save(OutputStream out, String comments) {
            p.save(out, comments);
        }
        public int size() { return p.size(); }
        public void store(OutputStream out, String comments)
           throws IOException {
            p.store(out, comments);
        }
        public void store(Writer writer, String comments)
           throws IOException {
            p.store(writer, comments);
        }
        public void storeToXML(OutputStream os, String comment)
            throws IOException {
            p.storeToXML(os, comment);
        }
        public void storeToXML(OutputStream os, String comment, String encoding)
            throws IOException {
            p.storeToXML(os, comment, encoding);
        }
        public void storeToXML(OutputStream os, String comment, Charset charset)
            throws IOException {
            p.storeToXML(os, comment, charset);
        }
        public Set<String> stringPropertyNames() {
            return p.stringPropertyNames();
        }
        public String toString() { return p.toString(); }
        public Collection<Object> values() { return p.values(); }


        // mutator methods
        public void clear() { throw new UnsupportedOperationException(); }
        public Object compute(Object key,
            BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
            throw new UnsupportedOperationException();
        }
        public Object computeIfAbsent(Object key,
            Function<? super Object,? extends Object> mappingFunction) {
            throw new UnsupportedOperationException();
        }
        public Object computeIfPresent(Object key,
            BiFunction<? super Object,? super Object,? extends Object> remappingFunction) {
            throw new UnsupportedOperationException();
        }
        public Provider configure(String configArg) {
            throw new UnsupportedOperationException();
        }
        public void load(InputStream inStream) throws IOException {
            throw new UnsupportedOperationException();
        }
        public void load(Reader reader) throws IOException {
            throw new UnsupportedOperationException();
        }
        public void loadFromXML(InputStream in) throws IOException,
            InvalidPropertiesFormatException {
            throw new UnsupportedOperationException();
        }
        public Object merge(Object key, Object value,
            BiFunction<? super Object,? super Object,? extends Object> remappingFunction) {
            throw new UnsupportedOperationException();
        }
        public Object put(Object key, Object value) {
            throw new UnsupportedOperationException();
        }
        public void putAll(Map<?,?> t) {
            throw new UnsupportedOperationException();
        }
        public Object putIfAbsent(Object key, Object value) {
            throw new UnsupportedOperationException();
        }
        protected void putService(Provider.Service s) {
            throw new UnsupportedOperationException();
        }
        public Object remove(Object key) {
            throw new UnsupportedOperationException();
        }
        public boolean remove(Object key, Object value) {
            throw new UnsupportedOperationException();
        }
        protected void removeService(Provider.Service s) {
            throw new UnsupportedOperationException();
        }
        public Object replace(Object key, Object value) {
            throw new UnsupportedOperationException();
        }
        public boolean replace(Object key, Object oldValue, Object newValue) {
            throw new UnsupportedOperationException();
        }
        public void replaceAll(BiFunction<? super Object,? super Object,? extends Object> function) {
            throw new UnsupportedOperationException();
        }
        public Object setProperty(String key, String value) {
            throw new UnsupportedOperationException();
        }
    }
}
