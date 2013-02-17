package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgInherits is a Querydsl query type for QPgInherits
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgInherits extends com.mysema.query.sql.RelationalPathBase<QPgInherits> {

    private static final long serialVersionUID = 633778995;

    public static final QPgInherits pgInherits = new QPgInherits("pg_inherits");

    public final NumberPath<Long> inhparent = createNumber("inhparent", Long.class);

    public final NumberPath<Long> inhrelid = createNumber("inhrelid", Long.class);

    public final NumberPath<Integer> inhseqno = createNumber("inhseqno", Integer.class);

    public QPgInherits(String variable) {
        super(QPgInherits.class, forVariable(variable), "pg_catalog", "pg_inherits");
    }

    @SuppressWarnings("all")
    public QPgInherits(Path<? extends QPgInherits> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_inherits");
    }

    public QPgInherits(PathMetadata<?> metadata) {
        super(QPgInherits.class, metadata, "pg_catalog", "pg_inherits");
    }

}

