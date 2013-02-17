package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgIndex is a Querydsl query type for QPgIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgIndex extends com.mysema.query.sql.RelationalPathBase<QPgIndex> {

    private static final long serialVersionUID = 13425239;

    public static final QPgIndex pgIndex = new QPgIndex("pg_index");

    public final BooleanPath indcheckxmin = createBoolean("indcheckxmin");

    public final SimplePath<Object> indclass = createSimple("indclass", Object.class);

    public final SimplePath<Object> indcollation = createSimple("indcollation", Object.class);

    public final SimplePath<Object> indexprs = createSimple("indexprs", Object.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final BooleanPath indimmediate = createBoolean("indimmediate");

    public final BooleanPath indisclustered = createBoolean("indisclustered");

    public final BooleanPath indisexclusion = createBoolean("indisexclusion");

    public final BooleanPath indisprimary = createBoolean("indisprimary");

    public final BooleanPath indisready = createBoolean("indisready");

    public final BooleanPath indisunique = createBoolean("indisunique");

    public final BooleanPath indisvalid = createBoolean("indisvalid");

    public final SimplePath<Object> indkey = createSimple("indkey", Object.class);

    public final NumberPath<Short> indnatts = createNumber("indnatts", Short.class);

    public final SimplePath<Object> indoption = createSimple("indoption", Object.class);

    public final SimplePath<Object> indpred = createSimple("indpred", Object.class);

    public final NumberPath<Long> indrelid = createNumber("indrelid", Long.class);

    public QPgIndex(String variable) {
        super(QPgIndex.class, forVariable(variable), "pg_catalog", "pg_index");
    }

    @SuppressWarnings("all")
    public QPgIndex(Path<? extends QPgIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_index");
    }

    public QPgIndex(PathMetadata<?> metadata) {
        super(QPgIndex.class, metadata, "pg_catalog", "pg_index");
    }

}

