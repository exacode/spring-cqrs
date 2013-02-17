package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpfamily is a Querydsl query type for QPgOpfamily
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpfamily extends com.mysema.query.sql.RelationalPathBase<QPgOpfamily> {

    private static final long serialVersionUID = -80355104;

    public static final QPgOpfamily pgOpfamily = new QPgOpfamily("pg_opfamily");

    public final NumberPath<Long> opfmethod = createNumber("opfmethod", Long.class);

    public final StringPath opfname = createString("opfname");

    public final NumberPath<Long> opfnamespace = createNumber("opfnamespace", Long.class);

    public final NumberPath<Long> opfowner = createNumber("opfowner", Long.class);

    public QPgOpfamily(String variable) {
        super(QPgOpfamily.class, forVariable(variable), "pg_catalog", "pg_opfamily");
    }

    @SuppressWarnings("all")
    public QPgOpfamily(Path<? extends QPgOpfamily> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opfamily");
    }

    public QPgOpfamily(PathMetadata<?> metadata) {
        super(QPgOpfamily.class, metadata, "pg_catalog", "pg_opfamily");
    }

}

