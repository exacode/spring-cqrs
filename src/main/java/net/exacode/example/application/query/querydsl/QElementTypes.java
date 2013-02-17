package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QElementTypes is a Querydsl query type for QElementTypes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QElementTypes extends com.mysema.query.sql.RelationalPathBase<QElementTypes> {

    private static final long serialVersionUID = 758685473;

    public static final QElementTypes elementTypes = new QElementTypes("element_types");

    public final SimplePath<Object> characterMaximumLength = createSimple("character_maximum_length", Object.class);

    public final SimplePath<Object> characterOctetLength = createSimple("character_octet_length", Object.class);

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public final SimplePath<Object> collectionTypeIdentifier = createSimple("collection_type_identifier", Object.class);

    public final SimplePath<Object> dataType = createSimple("data_type", Object.class);

    public final SimplePath<Object> datetimePrecision = createSimple("datetime_precision", Object.class);

    public final SimplePath<Object> domainDefault = createSimple("domain_default", Object.class);

    public final SimplePath<Object> dtdIdentifier = createSimple("dtd_identifier", Object.class);

    public final SimplePath<Object> intervalPrecision = createSimple("interval_precision", Object.class);

    public final SimplePath<Object> intervalType = createSimple("interval_type", Object.class);

    public final SimplePath<Object> maximumCardinality = createSimple("maximum_cardinality", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> objectCatalog = createSimple("object_catalog", Object.class);

    public final SimplePath<Object> objectName = createSimple("object_name", Object.class);

    public final SimplePath<Object> objectSchema = createSimple("object_schema", Object.class);

    public final SimplePath<Object> objectType = createSimple("object_type", Object.class);

    public final SimplePath<Object> scopeCatalog = createSimple("scope_catalog", Object.class);

    public final SimplePath<Object> scopeName = createSimple("scope_name", Object.class);

    public final SimplePath<Object> scopeSchema = createSimple("scope_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QElementTypes(String variable) {
        super(QElementTypes.class, forVariable(variable), "information_schema", "element_types");
    }

    @SuppressWarnings("all")
    public QElementTypes(Path<? extends QElementTypes> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "element_types");
    }

    public QElementTypes(PathMetadata<?> metadata) {
        super(QElementTypes.class, metadata, "information_schema", "element_types");
    }

}

