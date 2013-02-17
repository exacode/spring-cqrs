package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLargeobjectLoidPnIndex is a Querydsl query type for QPgLargeobjectLoidPnIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLargeobjectLoidPnIndex extends com.mysema.query.sql.RelationalPathBase<QPgLargeobjectLoidPnIndex> {

    private static final long serialVersionUID = 27580471;

    public static final QPgLargeobjectLoidPnIndex pgLargeobjectLoidPnIndex = new QPgLargeobjectLoidPnIndex("pg_largeobject_loid_pn_index");

    public final NumberPath<Long> loid = createNumber("loid", Long.class);

    public final NumberPath<Integer> pageno = createNumber("pageno", Integer.class);

    public QPgLargeobjectLoidPnIndex(String variable) {
        super(QPgLargeobjectLoidPnIndex.class, forVariable(variable), "pg_catalog", "pg_largeobject_loid_pn_index");
    }

    @SuppressWarnings("all")
    public QPgLargeobjectLoidPnIndex(Path<? extends QPgLargeobjectLoidPnIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_largeobject_loid_pn_index");
    }

    public QPgLargeobjectLoidPnIndex(PathMetadata<?> metadata) {
        super(QPgLargeobjectLoidPnIndex.class, metadata, "pg_catalog", "pg_largeobject_loid_pn_index");
    }

}

