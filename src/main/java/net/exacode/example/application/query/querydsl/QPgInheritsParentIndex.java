package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgInheritsParentIndex is a Querydsl query type for QPgInheritsParentIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgInheritsParentIndex extends com.mysema.query.sql.RelationalPathBase<QPgInheritsParentIndex> {

    private static final long serialVersionUID = 3346709;

    public static final QPgInheritsParentIndex pgInheritsParentIndex = new QPgInheritsParentIndex("pg_inherits_parent_index");

    public final NumberPath<Long> inhparent = createNumber("inhparent", Long.class);

    public QPgInheritsParentIndex(String variable) {
        super(QPgInheritsParentIndex.class, forVariable(variable), "pg_catalog", "pg_inherits_parent_index");
    }

    @SuppressWarnings("all")
    public QPgInheritsParentIndex(Path<? extends QPgInheritsParentIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_inherits_parent_index");
    }

    public QPgInheritsParentIndex(PathMetadata<?> metadata) {
        super(QPgInheritsParentIndex.class, metadata, "pg_catalog", "pg_inherits_parent_index");
    }

}

