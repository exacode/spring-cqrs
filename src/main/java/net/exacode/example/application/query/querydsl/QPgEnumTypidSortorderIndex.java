package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgEnumTypidSortorderIndex is a Querydsl query type for QPgEnumTypidSortorderIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgEnumTypidSortorderIndex extends com.mysema.query.sql.RelationalPathBase<QPgEnumTypidSortorderIndex> {

    private static final long serialVersionUID = 1754060876;

    public static final QPgEnumTypidSortorderIndex pgEnumTypidSortorderIndex = new QPgEnumTypidSortorderIndex("pg_enum_typid_sortorder_index");

    public final NumberPath<Float> enumsortorder = createNumber("enumsortorder", Float.class);

    public final NumberPath<Long> enumtypid = createNumber("enumtypid", Long.class);

    public QPgEnumTypidSortorderIndex(String variable) {
        super(QPgEnumTypidSortorderIndex.class, forVariable(variable), "pg_catalog", "pg_enum_typid_sortorder_index");
    }

    @SuppressWarnings("all")
    public QPgEnumTypidSortorderIndex(Path<? extends QPgEnumTypidSortorderIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_enum_typid_sortorder_index");
    }

    public QPgEnumTypidSortorderIndex(PathMetadata<?> metadata) {
        super(QPgEnumTypidSortorderIndex.class, metadata, "pg_catalog", "pg_enum_typid_sortorder_index");
    }

}

