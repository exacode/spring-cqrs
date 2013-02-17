package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLanguage is a Querydsl query type for QPgLanguage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLanguage extends com.mysema.query.sql.RelationalPathBase<QPgLanguage> {

    private static final long serialVersionUID = -1206667341;

    public static final QPgLanguage pgLanguage = new QPgLanguage("pg_language");

    public final SimplePath<Object[]> lanacl = createSimple("lanacl", Object[].class);

    public final NumberPath<Long> laninline = createNumber("laninline", Long.class);

    public final BooleanPath lanispl = createBoolean("lanispl");

    public final StringPath lanname = createString("lanname");

    public final NumberPath<Long> lanowner = createNumber("lanowner", Long.class);

    public final NumberPath<Long> lanplcallfoid = createNumber("lanplcallfoid", Long.class);

    public final BooleanPath lanpltrusted = createBoolean("lanpltrusted");

    public final NumberPath<Long> lanvalidator = createNumber("lanvalidator", Long.class);

    public QPgLanguage(String variable) {
        super(QPgLanguage.class, forVariable(variable), "pg_catalog", "pg_language");
    }

    @SuppressWarnings("all")
    public QPgLanguage(Path<? extends QPgLanguage> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_language");
    }

    public QPgLanguage(PathMetadata<?> metadata) {
        super(QPgLanguage.class, metadata, "pg_catalog", "pg_language");
    }

}

